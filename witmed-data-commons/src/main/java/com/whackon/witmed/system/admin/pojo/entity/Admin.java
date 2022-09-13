package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
	private String id;                      // 主键，采用雪花算法生成
	private String no;                      // 工号
	private String name;                    // 姓名
	private String cellphone;               // 手机号码
	private String password;                // 登录密码
	private Integer techTitle;              // 专业技术职务
	private Integer education;              // 学历
	private Integer major;                  // 专业
	private Integer techRank;               // 专业技术职务等级
}
