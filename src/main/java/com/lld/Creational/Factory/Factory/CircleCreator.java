package com.lld.Creational.Factory.SimpleFactory;

public class CircleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
