package com.alice.designpattern.abstractFactoryPattern.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("class.Rectangle,method.draw()");
    }
}
