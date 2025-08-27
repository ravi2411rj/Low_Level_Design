package com.lld.Behavioral.State.Example1;

public class OffState implements State {
    public void pressButton(FanContext context) {
        System.out.println("Turning fan to LOW speed.");
        context.setState(new LowState());
    }
}
