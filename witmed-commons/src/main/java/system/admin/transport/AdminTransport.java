package system.admin.transport;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统人员传输层接口</b>
 *
 * @author Arthur
 * @date 2022/9/13
 */
@FeignClient(name = "witmed-system-provider")
public interface AdminTransport {
}
