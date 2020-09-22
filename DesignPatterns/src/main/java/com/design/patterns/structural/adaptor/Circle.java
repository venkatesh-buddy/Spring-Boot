package com.design.patterns.structural.adaptor;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle Shape");		
	}

	@Override
	public String description() {		
		return "It's a Circle";
	}

}
