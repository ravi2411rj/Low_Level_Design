package com.lld.Structural.Facade.Example1;

public class Projector {
    void on() {
        System.out.println("Projector ON");
    }

    void setInput(String source) {
        System.out.println("Projector input set to: " + source);
    }

    void off() {
        System.out.println("Projector OFF");
    }
}
