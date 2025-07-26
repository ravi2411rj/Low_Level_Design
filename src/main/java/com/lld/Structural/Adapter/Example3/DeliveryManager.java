package com.lld.Structural.Adapter.Example3;

public class DeliveryManager {
    public void assignDelivery(Vehicle vehicle, String item) {
        vehicle.deliver(item);
    }
}
