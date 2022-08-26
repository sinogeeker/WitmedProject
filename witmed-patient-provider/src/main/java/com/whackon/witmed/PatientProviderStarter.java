package com.whackon.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b>智慧医疗信息平台 - 患者功能 - provider 启动类</b>
 *
 * @author Arthur
 * @date 2022/8/25
 */
@MapperScan("com.whackon.witmed.patient.*.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class PatientProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(PatientProviderStarter.class, args);
	}
}
