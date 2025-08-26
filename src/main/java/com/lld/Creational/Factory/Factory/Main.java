package com.lld.Creational.Factory.Factory;

public class Main {
    public static void main(String[] args) {
        ShapeCreator creator1 = new CircleCreator();
        creator1.render();  // Output: Drawing a Circle

        ShapeCreator creator2 = new SquareCreator();
        creator2.render();  // Output: Drawing a Square
    }
}

