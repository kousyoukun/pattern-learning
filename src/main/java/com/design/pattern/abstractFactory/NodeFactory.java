package com.design.pattern.abstractFactory;

public class NodeFactory extends AbstractFactory {
    public Node createNode(String nodeType) {
        if ("start".equals(nodeType)) {
            return new StartNode();
        } else if ("end".equals(nodeType)) {
            return new EndNode();
        }
        return null;
    }

    public Job createJob(String jobType) {
        return null;
    }
}
