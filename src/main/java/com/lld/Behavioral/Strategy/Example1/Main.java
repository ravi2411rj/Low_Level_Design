package com.lld.Behavioral.Strategy.Example1;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentMethod(new CreditCardPayment());
        cart.checkout(1200.00);

        cart.setPaymentMethod(new UpiPayment());
        cart.checkout(499.99);
    }
}
