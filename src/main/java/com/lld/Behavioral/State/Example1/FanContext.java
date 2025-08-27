package com.lld.Behavioral.State.Example1;

public class FanContext {
    private State currentState;

    public FanContext() {
        currentState = new OffState(); // Initial state
    }

    public void setState(State state) {
        currentState = state;
    }

    public void pressButton() {
        currentState.pressButton(this);
    }
}
