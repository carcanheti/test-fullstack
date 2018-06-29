package com.test.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = { "com.test.api.config.controller"})
//@EntityScan(basePackages = { "com.test.api","com.test.api.config", "com.test.api.model", "com.test.api.service", "com.test" })
//@EnableJpaRepositories(basePackages = { "com.test.api.config.repository" , "com.test"})
public class TestMain {

	public static void main(String[] args) {
		SpringApplication.run(TestMain.class, args);
		
	}
}
