package com.alice.designpattern.factoryPattern;

import com.alice.designpattern.factoryPattern.shape.Circle;
import com.alice.designpattern.factoryPattern.shape.Rectangle;
import com.alice.designpattern.factoryPattern.shape.Shape;
import com.alice.designpattern.factoryPattern.shape.Square;

public class ShapeFactory {
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
}
