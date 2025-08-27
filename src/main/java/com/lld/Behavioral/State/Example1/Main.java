package com.lld.Behavioral.State.Example1;

public class Main {
    public static void main(String[] args) {
        FanContext fan = new FanContext();

        fan.pressButton(); // OFF → LOW
        fan.pressButton(); // LOW → HIGH
        fan.pressButton(); // HIGH → OFF
        fan.pressButton(); // OFF → LOW
    }
}
