package com.whackon.witmed.system.admin.service;

import com.whackon.witmed.system.admin.pojo.vo.AdminVO;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员业务层接口</b>
 *
 * @author Arthur
 * @date 2022/9/13
 */
public interface AdminService {
	/**
	 * <b>根据手机号码查询系统用户视图信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	AdminVO getAdminVOByCellphone(String cellphone) throws Exception;
}
