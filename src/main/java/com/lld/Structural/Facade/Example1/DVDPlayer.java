package com.lld.Structural.Facade.Example1;

public class DVDPlayer {
    void on() {
        System.out.println("DVD Player ON");
    }

    void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    void off() {
        System.out.println("DVD Player OFF");
    }
}
