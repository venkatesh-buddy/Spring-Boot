package com.design.patterns.structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
	List<Shape> shapes = new ArrayList<>();
	
	public void addShape(Shape shape) {
		shapes.add(shape);		
	}
	
	public void draw() {
		if(shapes.isEmpty()) {
			System.out.println("No shape exist");
		}else {
			shapes.forEach(s->s.draw());
		}
	}
	
	public void description() {
		if(shapes.isEmpty()) {
			System.out.println("No description available");
		}else {
			shapes.forEach(s->s.description());
		}
	}

}
