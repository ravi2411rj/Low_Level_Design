package com.lld.Behavioral.Observer.Example1;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber a = new Subscriber("Alice");
        Subscriber b = new Subscriber("Bob");

        agency.subscribe(a);
        agency.subscribe(b);

        agency.publishNews("Elections 2025 are announced!");
    }
}