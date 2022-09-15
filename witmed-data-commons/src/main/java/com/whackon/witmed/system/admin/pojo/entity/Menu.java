package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统功能菜单实体信息</b>
 *
 * @author Arthur
 * @date 2022/9/9
 */
@Data
@TableName("sys_menu")
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 6494472229034048736L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键，采用主键自增长
	private String parent;                  // 上级功能菜单
	private String text;                    // 菜单文本
	private String code;                    // 菜单编码
	private String url;                     // 链接地址
	private String icon;                    // 菜单图标
	private Integer sort;                   // 排序
}
