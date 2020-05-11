package com.vtf.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vtf.test.mapper")
public class LogApplication {
	public static void main(String[] args) {
		SpringApplication.run(LogApplication.class, args);
	}

}
