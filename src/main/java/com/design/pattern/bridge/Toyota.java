package com.design.pattern.bridge;

public class Toyota extends Car {

    public Toyota(Engine engine) {
        super(engine);
    }

    public void installEngine() {
        System.out.println("Toyota:");
        this.getEngine().installEngine();
    }
}
