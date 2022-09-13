package com.whackon.witmed.system.hospital.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 部门科室实体信息</b>
 *
 * @author Arthur
 * @date 2022/9/9
 */
@TableName("sys_department")
public class Department extends BaseEntity {
	private static final long serialVersionUID = -5793475151487271519L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键，采用主键自增长
}
