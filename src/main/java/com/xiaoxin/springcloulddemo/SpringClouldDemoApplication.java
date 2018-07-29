package com.xiaoxin.springcloulddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan("com.xiaoxin.springcloulddemo")
public class SpringClouldDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClouldDemoApplication.class, args);
	}
}
