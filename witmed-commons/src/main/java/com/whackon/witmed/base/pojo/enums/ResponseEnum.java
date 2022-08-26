package com.whackon.witmed.base.pojo.enums;

/**
 * <b>系统响应码枚举信息</b>
 *
 * @author Arthur
 * @date 2022/8/24
 */
public enum ResponseEnum {
	RESPONSE_SUCCESS(BaseEnumConstants.RESPONSE_SUCCESS, "系统业务处理和响应成功"),
	RESPONSE_UNAUTH(BaseEnumConstants.RESPONSE_UNAUTH, "用户未进行系统认证"),
	RESPONSE_FAILURE(BaseEnumConstants.RESPONSE_FAILURE, "系统业务处理错误"),
	RESPONSE_EXCEPTION(BaseEnumConstants.RESPONSE_EXCEPTION, "系统响应异常");

	private Integer code;                       // 系统响应编码
	private String remark;                      // 系统响应编码说明

	private ResponseEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
