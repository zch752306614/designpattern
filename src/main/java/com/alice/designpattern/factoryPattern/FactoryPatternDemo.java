package com.alice.designpattern.factoryPattern;

import com.alice.designpattern.factoryPattern.shape.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
