package com.design.pattern.bridge;

public class Test {
    public static void main(String[] args) {
        Engine2000 engine2000 = new Engine2000();
        Engine2200 engine2200 = new Engine2200();

        Honda honda = new Honda(engine2000);
        honda.installEngine();

        Toyota toyota = new Toyota(engine2200);
        toyota.installEngine();
    }
}
