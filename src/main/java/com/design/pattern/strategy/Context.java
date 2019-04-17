package com.design.pattern.strategy;

public class Context {
    private Node node;

    public Context(Node node) {
        this.node = node;
    }

    public void execNode() {
        node.exec();
    }
}
