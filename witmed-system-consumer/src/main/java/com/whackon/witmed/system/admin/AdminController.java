package com.whackon.witmed.system.admin;

import com.whackon.witmed.base.controller.BaseController;
import com.whackon.witmed.base.pojo.vo.ResponseVO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	/**
	 * <b>系统人员登录</b>
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/login")
	public ResponseVO loginAdmin() throws Exception {
		return null;
	}
}
