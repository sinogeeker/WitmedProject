package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员实体信息</b>
 *
 * @author Arthur
 * @date 2022/9/9
 */
@Data
@TableName("sys_admin")
public class Admin extends BaseEntity {
	private static final long serialVersionUID = 4226492550883944160L;
	@TableId(type = IdType.INPUT)
	private String id;                      // 主键
	private String name;                    // 姓名
	private String cellphone;               // 手机号码
	private String password;                // 登录密码，采用 MD5 加密算法
	private String role;                    // 系统角色
	private String identity;                // 人员身份
	@TableField("techTitle")
	private String techTitle;               // 服务者专业技术职务
	private String education;               // 服务者学历
	private String major;                   // 服务者所学专业
	@TableField("techRank")
	private String techRank;                // 服务者专业技术职务等级
}
