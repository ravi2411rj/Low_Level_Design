package com.lld.Creational.Factory.Factory;

public class CircleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
