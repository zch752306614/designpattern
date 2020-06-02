package com.alice.designpattern.abstractFactoryPattern.shape;

import com.alice.designpattern.abstractFactoryPattern.AbstractFactory;
import com.alice.designpattern.abstractFactoryPattern.color.Color;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
