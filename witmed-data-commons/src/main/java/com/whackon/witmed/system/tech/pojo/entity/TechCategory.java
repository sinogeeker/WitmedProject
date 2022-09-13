package com.whackon.witmed.system.tech.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 专业技术职务类别实体信息</b>
 *
 * @author Arthur
 * @date 2022/9/9
 */
@TableName("sys_tech_category")
public class TechCategory extends BaseEntity {
	private static final long serialVersionUID = 7253582006951682706L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键，采用主键自增长
}
