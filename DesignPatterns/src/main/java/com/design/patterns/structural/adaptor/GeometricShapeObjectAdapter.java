package com.design.patterns.structural.adaptor;

public class GeometricShapeObjectAdapter implements Shape {
	private GeometricShape adaptee;

	public GeometricShapeObjectAdapter(GeometricShape adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void draw() {
		adaptee.drawShape();
	}

	@Override
	public String description() {
		if (adaptee instanceof Triangle) {
			return "Triangle object";
		} else if (adaptee instanceof Rhombus) {
			return "Rhombus object";
		} else {
			return "Unknown object";
		}
	}

}