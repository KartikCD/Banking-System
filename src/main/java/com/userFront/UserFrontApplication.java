package com.userFront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.userFront.config", "com.userFront.controller", "com.userFront.dao", "com.userFront.domain", "com.userFront.domain.security", "com.userFront.resource", "com.userFront.service", "com.userFront.service.UserServiceImpl" })
public class UserFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFrontApplication.class, args);
	}
}
