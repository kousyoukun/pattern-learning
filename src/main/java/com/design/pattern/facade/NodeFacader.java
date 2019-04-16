package com.design.pattern.facade;

public class NodeFacader {
    private Node startNode;
    private Node endNode;

    public NodeFacader() {
        startNode = new StartNode();
        endNode = new EndNode();
    }

    public void execStartNode() {
        startNode.exec();
    }

    public void execEndNode() {
        endNode.exec();
    }
}
