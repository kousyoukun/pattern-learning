package com.design.pattern.factory;

public class Test {
    public static void main(String[] args) {
        NodeFactory factory = new NodeFactory();
        Node start = factory.getNode("start");
        start.exec();
        Node end = factory.getNode("end");
        end.exec();
    }
}
