package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员角色实体信息</b>
 *
 * @author Arthur
 * @date 2022/9/9
 */
@Data
@TableName("sys_role")
public class Role extends BaseEntity {
	private static final long serialVersionUID = 3832012392097686144L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键，采用主键自增长
	private String name;                    // 角色名称
	private String code;                    // 角色编码
}
