package com.employee.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value= {"com.employee.controller", "com.employee.service"})
public class SpringBootJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJsonApplication.class, args);
	}
}
