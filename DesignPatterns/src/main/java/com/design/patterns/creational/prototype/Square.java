package com.design.patterns.creational.prototype;

import org.springframework.stereotype.Service;

@Service
public class Square extends Shape {
	Square(){
		type = "Square";
	}

	@Override
	String draw() {
		return "Square";
	}

}
