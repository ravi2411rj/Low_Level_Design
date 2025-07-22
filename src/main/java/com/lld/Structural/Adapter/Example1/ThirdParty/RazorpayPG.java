package com.lld.Structural.Adapter.Example1.ThirdParty;

public class RazorpayPG {
    public String initiatePayment(String cardNumber) {
        System.out.println("Payment started using Razorpay");
        return "Razorpay";
    }
}
