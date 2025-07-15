package com.lld.Creational.Prototype_Registry.Example1;

import java.util.HashMap;

public class Registry<T> {
    private final HashMap<String, Prototype<T>> registry;

    public Registry() {
        this.registry = new HashMap<>();
    }

    public void add(String name, Prototype<T> prototype) {
        registry.put(name, prototype);
    }

    public Prototype<T> get(String name) {
        return registry.get(name);
    }
}
