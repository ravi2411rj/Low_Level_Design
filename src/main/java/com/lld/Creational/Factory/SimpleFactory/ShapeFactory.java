package com.lld.Creational.Factory.SimpleFactory;

public class ShapeFactory {
    public static Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
