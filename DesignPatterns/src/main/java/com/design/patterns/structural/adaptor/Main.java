package com.design.patterns.structural.adaptor;

public class Main {
	
	//https://dzone.com/articles/adapter-design-pattern-in-java
	public static void main(String args[]) {
		Drawing d = new Drawing();
		d.addShape(new Rectangle());
		d.addShape(new Circle());
		d.draw();
		d.description();
	   d.addShape(new GeometricShapeObjectAdapter(new Triangle()));
       d.addShape(new GeometricShapeObjectAdapter(new Rhombus()));
       System.out.println("Drawing...");
       d.draw();       
       d.description();
	}

}
