package com.design.pattern.decorator;

public class BindedNodeDecorator extends NodeDecorator {

    public BindedNodeDecorator(Node decoratedNode) {
        super(decoratedNode);
    }

    @Override
    public void exec() {
        decoratedNode.exec();
        setParam(decoratedNode);
    }

    private void setParam(Node decoratedNode) {
        System.out.println("bind param***");
    }
}
