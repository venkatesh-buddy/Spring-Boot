package com.design.patterns.creational.prototype;

import org.springframework.stereotype.Service;
import com.design.patterns.creational.prototype.Shape;

@Service
public class Circle extends Shape {
	Circle(){
		type ="Circle";
	}

	@Override
	String draw() {
		return "Circle";
	}

}
