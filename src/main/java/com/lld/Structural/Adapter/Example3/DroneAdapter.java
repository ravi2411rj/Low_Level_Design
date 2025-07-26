package com.lld.Structural.Adapter.Example3;

public class DroneAdapter implements Vehicle {
    private final Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    public void deliver(String item) {
        drone.sendPackage(item);
    }
}
