package com.whackon.witmed.system.admin;

import cn.hutool.crypto.digest.MD5;
import com.whackon.witmed.base.controller.BaseController;
import com.whackon.witmed.base.pojo.enums.StatusEnum;
import com.whackon.witmed.base.pojo.vo.ResponseVO;
import com.whackon.witmed.base.util.RedisUtil;
import com.whackon.witmed.base.util.SystemConstants;
import com.whackon.witmed.base.util.TokenUtil;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.pojo.vo.LoginVO;
import com.whackon.witmed.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员控制层类</b>
 *
 * @author Arthur
 * @date 2022/9/13
 */
@RestController("adminController")
@RequestMapping("/admin")
@CrossOrigin
public class AdminController extends BaseController {
	@Autowired
	private AdminTransport adminTransport;
	@Autowired
	private RedisUtil redisUtil;

	/**
	 * <b>系统人员登录</b>
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/login")
	public ResponseVO loginAdmin(@Validated @RequestBody LoginVO loginVO, BindingResult bindingResult)
			throws Exception {
		// 使用了 Spring Validation 校验框架进行数据校验，因此只需要检查是否有校验错误信息即可
		List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
		// 判断得到的错误信息集合是否有元素
		if (!fieldErrorList.isEmpty()) {
			// 错误集合中存在元素，那么说明前端所提交的数据中有校验失败信息，那么登录失败
			return ResponseVO.createFailureResponseVO(fieldErrorList);
		}

		// 如果未进入到 if 分支，那么校验通过，进行登录判断，通过手机号码获得用户信息
		AdminVO adminVO = adminTransport.getAdminVOByCellphone(loginVO.getCellphone());
		if (adminVO == null) {
			// 根据手机号码未得到用户信息
			return ResponseVO.createFailureResponseVO("手机号码或登录密码错误");
		}

		// 根据手机号码查询到用户信息后，判断高用户是否允许登录
		if (StatusEnum.STATUS_DISABLE.getCode().equals(adminVO.getStatus())) {
			// 此时该用户为禁用状态，则禁止登陆
			return ResponseVO.createFailureResponseVO("该用户禁止登陆系统");
		}

		// 对登录密码进行加密，判断密码是否相等
		if (!adminVO.getPassword().equals(MD5.create().digestHex(loginVO.getPassword()))) {
			// 此时用户登录所提交的密码和系统查询密码不相等
			return ResponseVO.createFailureResponseVO("手机号码或登录密码错误");
		}

		// 密码判断相等，则该用户登录成功，根据当前登录用户生成对应的 Token 信息
		String token = TokenUtil.createToken(adminVO, SystemConstants.TOKEN_EXPIRE);
		// 为了防止前端伪造 Token，那么以 Token 为 key，存储到 Redis
		redisUtil.saveToRedis(token, adminVO, SystemConstants.TOKEN_EXPIRE);

		// 至此登录成功，需要将 Token 信息提交给前端
		return ResponseVO.createSuccessResponseVO("登录成功", token);
	}
}
