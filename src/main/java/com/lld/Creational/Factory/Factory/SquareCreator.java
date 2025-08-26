package com.lld.Creational.Factory.Factory;

public class SquareCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
