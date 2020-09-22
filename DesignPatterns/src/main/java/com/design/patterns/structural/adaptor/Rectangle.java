package com.design.patterns.structural.adaptor;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle shape");		
	}

	@Override
	public String description() {
		return "It's a rectangle";
	}
}
