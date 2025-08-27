package com.lld.Structural.Facade.Example1;

public class SoundSystem {
    void on() {
        System.out.println("Sound System ON");
    }

    void setVolume(int level) {
        System.out.println("Volume set to: " + level);
    }

    void off() {
        System.out.println("Sound System OFF");
    }
}
