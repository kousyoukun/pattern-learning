package com.design.pattern.prototype;

public class EndNode implements NodePrototype {
    public NodePrototype clone() {
        return new EndNode();
    }
}
