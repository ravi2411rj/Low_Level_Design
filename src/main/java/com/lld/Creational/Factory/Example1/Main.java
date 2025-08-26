package com.lld.Creational.Factory.Example1;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        Vehicle bike = VehicleFactory.createVehicle("bike");

        car.drive();
        bike.drive();
    }
}
