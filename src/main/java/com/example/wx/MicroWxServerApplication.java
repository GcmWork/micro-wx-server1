package com.example.wx;

import com.example.wx.config.datasource.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EnableAutoConfiguration
@Import(DynamicDataSourceRegister.class)
public class MicroWxServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroWxServerApplication.class, args);
	}
}
