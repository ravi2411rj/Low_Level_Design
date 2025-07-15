package com.lld.Creational.Prototype_Registry.Example2;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {
    private final Map<ConfigurationType, Configuration> configurations = new HashMap<>();

    @Override
    public void addPrototype(Configuration configuration) {
        configurations.put(configuration.getType(), configuration);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return configurations.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return configurations.get(type).cloneObject();
    }
}
