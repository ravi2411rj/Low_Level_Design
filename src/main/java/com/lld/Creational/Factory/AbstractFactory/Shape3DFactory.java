package com.lld.Creational.Factory.AbstractFactory;

public class Shape3DFactory implements ShapeFactory {
    @Override
    public Circle createCircle() {
        return new Circle3D();
    }

    @Override
    public Square createSquare() {
        return new Square3D();
    }
}
