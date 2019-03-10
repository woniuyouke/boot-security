package com.boot.security.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * 
 * @author wpw
 *
 */
@SpringBootApplication
public class SecurityApplication  {

/*
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SecurityApplication.class);
	}*/


	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
