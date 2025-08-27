package com.lld.Behavioral.State.Example1;

class LowState implements State {
    public void pressButton(FanContext context) {
        System.out.println("Turning fan to HIGH speed.");
        context.setState(new HighState());
    }
}