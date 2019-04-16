package com.design.pattern.decorator;

public abstract class NodeDecorator {
    protected Node decoratedNode;

    public NodeDecorator(Node decoratedNode) {
        this.decoratedNode = decoratedNode;
    }

    public void exec() {
        decoratedNode.exec();
    }
}
