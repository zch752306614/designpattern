package com.alice.designpattern.abstractFactoryPattern;

import com.alice.designpattern.abstractFactoryPattern.color.Color;
import com.alice.designpattern.abstractFactoryPattern.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
