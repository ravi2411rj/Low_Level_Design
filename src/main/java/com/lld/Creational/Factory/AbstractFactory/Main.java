package com.lld.Creational.Factory.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory2D = new Shape2DFactory();
        Circle circle2D = factory2D.createCircle();
        Square square2D = factory2D.createSquare();
        circle2D.draw();   // Output: Drawing a 2D Circle
        square2D.draw();   // Output: Drawing a 2D Square

        ShapeFactory factory3D = new Shape3DFactory();
        Circle circle3D = factory3D.createCircle();
        Square square3D = factory3D.createSquare();
        circle3D.draw();   // Output: Drawing a 3D Circle
        square3D.draw();   // Output: Drawing a 3D Square
    }
}
