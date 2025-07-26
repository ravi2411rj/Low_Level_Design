package com.lld.Structural.Adapter.Example3;

public class Truck implements Vehicle {
    public void deliver(String item) {
        System.out.println("Delivering " + item + " by road using Truck.");
    }
}
