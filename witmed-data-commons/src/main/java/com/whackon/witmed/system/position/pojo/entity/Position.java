package com.whackon.witmed.system.position.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 职位信息表</b>
 *
 * @author Arthur
 * @date 2022/9/9
 */
@TableName("sys_position")
public class Position extends BaseEntity {
	private static final long serialVersionUID = -4422273010965431667L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键，采用主键自增长
}
