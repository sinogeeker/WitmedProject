package com.whackon.witmed.system.admin.pojo.util;

import com.whackon.witmed.system.admin.pojo.entity.Admin;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员 POJO 转换工具类</b>
 *
 * @author Arthur
 * @date 2022/9/15
 */
@Mapper
public interface AdminPojoMapper {
	// 创建该接口对应实现类对象
	AdminPojoMapper INSTANCE = Mappers.getMapper(AdminPojoMapper.class);

	/**
	 * <b>将实体信息转换为视图信息</b>
	 * @param entity
	 * @return
	 */
	public AdminVO parseToVO(Admin entity);
}
