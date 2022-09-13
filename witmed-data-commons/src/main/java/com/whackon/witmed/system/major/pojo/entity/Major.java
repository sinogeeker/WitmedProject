package com.whackon.witmed.system.major.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 专业实体信息</b>
 *
 * @author Arthur
 * @date 2022/9/9
 */
@TableName("sys_major")
public class Major extends BaseEntity {
	private static final long serialVersionUID = 3333565831451440955L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键，主键自增长
}
