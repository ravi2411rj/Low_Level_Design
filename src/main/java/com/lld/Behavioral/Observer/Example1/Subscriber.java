package com.lld.Behavioral.Observer.Example1;

public class Subscriber implements Observer {
    private final String name;

    Subscriber(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
