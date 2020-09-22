package com.design.patterns.creational.abstractfactory;
public class ThreeDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(ShapeType name) {
        if (ShapeType.SPHERE == name) {
            return new Sphere();
        }
        return null;
    }
}