package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员视图信息</b>
 *
 * @author Arthur
 * @date 2022/9/15
 */
@Data
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = 811957010974699686L;
	private String id;                      // 主键
	private String name;                    // 姓名
	private String cellphone;               // 手机号码
	private String password;                // 登录密码，采用 MD5 加密算法
}
