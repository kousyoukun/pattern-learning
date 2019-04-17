package com.design.pattern.strategy;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new StartNode());
        context.execNode();

        context = new Context(new EndNode());
        context.execNode();

        context = new Context(new ScriptNode());
        context.execNode();
    }
}
