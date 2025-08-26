package com.lld.Creational.Factory.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("circle");
        shape1.draw();  // Output: Drawing a Circle

        Shape shape2 = ShapeFactory.createShape("square");
        shape2.draw();  // Output: Drawing a Square
    }
}
