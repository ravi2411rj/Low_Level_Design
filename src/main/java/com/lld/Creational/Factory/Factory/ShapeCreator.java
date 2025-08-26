package com.lld.Creational.Factory.SimpleFactory;

public abstract class ShapeCreator {
    public abstract Shape createShape();

    public void render() {
        Shape shape = createShape();
        shape.draw();
    }
}
