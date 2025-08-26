package com.lld.Creational.Factory.AbstractFactory;

public class Shape2DFactory implements ShapeFactory {
    @Override
    public Circle createCircle() {
        return new Circle2D();
    }

    @Override
    public Square createSquare() {
        return new Square2D();
    }
}
