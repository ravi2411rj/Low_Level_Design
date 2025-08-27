package com.lld.Behavioral.State.Example1;

class HighState implements State {
    public void pressButton(FanContext context) {
        System.out.println("Turning fan OFF.");
        context.setState(new OffState());
    }
}
