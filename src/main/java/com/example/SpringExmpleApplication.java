package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication    // 스프링 구동을 위한 필수 어노테이션
public class SpringExmpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExmpleApplication.class, args);
	}

}
