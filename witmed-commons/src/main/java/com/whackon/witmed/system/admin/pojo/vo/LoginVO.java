package com.whackon.witmed.system.admin.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员登录视图信息</b>
 *
 * @author Arthur
 * @date 2022/9/15
 */
@Data
public class LoginVO implements Serializable {
	private static final long serialVersionUID = 8687351484284798116L;
	@NotBlank(message = "未填写手机号码")
	@Pattern(regexp = "1[0-9]{10}", message = "手机号码格式错误")
	private String cellphone;                       // 手机号码
	@NotBlank(message = "未填写登录密码")
	@Pattern(regexp = "[0-9A-Za-z]{6,}", message = "登录密码格式错误")
	private String password;                        // 登录密码
}
