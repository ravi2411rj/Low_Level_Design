package com.lld.Structural.Adapter.Example3;

public class Main {
    public static void main(String[] args) {
        DeliveryManager manager = new DeliveryManager();

        Vehicle truck = new Truck();
        manager.assignDelivery(truck, "Furniture");

        Drone drone = new Drone();
        Vehicle droneAdapter = new DroneAdapter(drone);

        manager.assignDelivery(droneAdapter, "Documents");
    }
}
