package com.design.pattern.bridge;

public class Honda extends Car {
    public Honda(Engine engine) {
        super(engine);
    }

    public void installEngine() {
        System.out.println("Honda:");
        this.getEngine().installEngine();
    }
}
