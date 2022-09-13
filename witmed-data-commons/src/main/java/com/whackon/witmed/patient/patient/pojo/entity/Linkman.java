package com.whackon.witmed.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;

/**
 * <b>智慧医疗信息平台 - 患者功能 - 患者联系人详情实体信息</b>
 *
 * @author Arthur
 * @date 2022/9/9
 */
@TableName("pa_linkman")
public class Linkman extends BaseEntity {
	private static final long serialVersionUID = 2686971864872541864L;
	@TableId(type = IdType.INPUT)
	private String id;                      // 主键，采用雪花算法
}
