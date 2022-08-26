package com.whackon.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b>智慧医疗信息平台 - 门诊功能 - provider 启动类</b>
 *
 * @author Arthur
 * @date 2022/8/25
 */
@MapperScan("com.whackon.witmed.clinic.*.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class ClinicProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(ClinicProviderStarter.class, args);
	}
}
