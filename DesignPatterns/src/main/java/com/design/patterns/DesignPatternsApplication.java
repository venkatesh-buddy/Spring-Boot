package com.design.patterns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.creational.Employee;
import com.design.patterns.creational.factory.FactoryServiceExample1;

@SpringBootApplication
public class DesignPatternsApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);		
		//builderPatter();
	}

	private static void builderPatter() {
		Employee e = new Employee.EmployeeBuilder("F1", "F2", 32, 125).setMail("t1@t.com").build();
		System.out.println("Employee::"+e);
		
	}
	
	

}
