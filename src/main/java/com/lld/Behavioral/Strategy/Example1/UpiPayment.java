package com.lld.Behavioral.Strategy.Example1;

class UpiPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}