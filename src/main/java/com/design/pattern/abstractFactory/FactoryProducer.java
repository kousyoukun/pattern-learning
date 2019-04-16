package com.design.pattern.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if ("job".equals(factory)) {
            return new JobFactory();
        } else if ("node".equals(factory)) {
            return new NodeFactory();
        }
        return null;
    }
}
