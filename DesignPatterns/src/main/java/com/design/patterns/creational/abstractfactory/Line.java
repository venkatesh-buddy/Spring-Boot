package com.design.patterns.creational.abstractfactory;
public class Line implements GeometricShape {
    @Override
    public String draw() {
        return "Line Drawn.";
    }
}