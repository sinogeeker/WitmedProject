package com.whackon.witmed.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 数据字典实体信息</b>
 *
 * @author Arthur
 * @date 2022/9/9
 */
@TableName("sys_dictionary")
public class Dictionary extends BaseEntity {
	private static final long serialVersionUID = 7172482097907332555L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键，采用主键自增长
}
