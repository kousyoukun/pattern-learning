package com.design.pattern.factory;

public class NodeFactory {
    public Node getNode(String type) {
        if ("start".equals(type)) {
            return new StartNode();
        } else if ("end".equals(type)) {
            return new EndNode();
        }
        return null;
    }
}
