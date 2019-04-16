package com.design.pattern.prototype;

public class StartNode implements NodePrototype {

    public NodePrototype clone() {
        return new StartNode();
    }
}
