package com.design.pattern.builder;

public class Director {
    public void construct(NodeBuilder nodeBuilder) {
        nodeBuilder.installStartNode();
        nodeBuilder.installScriptNode();
        nodeBuilder.installEndNode();
    }
}
