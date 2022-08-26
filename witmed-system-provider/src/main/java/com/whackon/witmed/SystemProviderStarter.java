package com.whackon.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b>智慧医疗信息平台 - 系统功能 - Provider 启动类</b>
 *
 * @author Arthur
 * @date 2022/8/24
 */
@MapperScan("com.whackon.witmed.system.*.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class SystemProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemProviderStarter.class, args);
	}
}
