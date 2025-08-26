package com.lld.Creational.Factory.SimpleFactory;

public class SquareCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
