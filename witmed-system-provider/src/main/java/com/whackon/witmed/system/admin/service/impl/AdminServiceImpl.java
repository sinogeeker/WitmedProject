package com.whackon.witmed.system.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.whackon.witmed.system.admin.mapper.AdminMapper;
import com.whackon.witmed.system.admin.pojo.entity.Admin;
import com.whackon.witmed.system.admin.pojo.util.AdminPojoMapper;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员业务层接口实现类</b>
 *
 * @author Arthur
 * @date 2022/9/13
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;

	/**
	 * <b>根据手机号码查询系统用户视图信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@Override
	public AdminVO getAdminVOByCellphone(String cellphone) throws Exception {
		// 创建 MyBatis Plus 查询对象
		QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>();
		// 设置查询条件
		queryWrapper.eq("cellphone", cellphone);
		// 进行列表查询
		List<Admin> entityList = adminMapper.selectList(queryWrapper);

		// 判断查询结果
		if (!entityList.isEmpty()) {
			// 查询获得结果，提取结果，将实体对象变为视图对象
			Admin entity = entityList.get(0);
			return AdminPojoMapper.INSTANCE.parseToVO(entity);
		}

		return null;
	}
}
