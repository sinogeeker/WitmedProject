package com.whackon.witmed.system.admin.transport;

import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员传输层接口</b>
 *
 * @author Arthur
 * @date 2022/9/13
 */
@FeignClient(name = "witmed-system-provider")
public interface AdminTransport {
	/**
	 * <b>根据手机号码查询系统用户视图信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/admin/trans/cellphone")
	AdminVO getAdminVOByCellphone(@RequestParam String cellphone) throws Exception;
}
