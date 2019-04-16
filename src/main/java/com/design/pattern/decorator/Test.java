package com.design.pattern.decorator;

public class Test {
    public static void main(String[] args) {
        StartNode startNode = new StartNode();

        BindedNodeDecorator start = new BindedNodeDecorator(new StartNode());
        BindedNodeDecorator end = new BindedNodeDecorator(new EndNode());

        System.out.println("unbind start node:");
        startNode.exec();

        System.out.println("bound start node:");
        start.exec();

        System.out.println("bound end node:");
        end.exec();
    }
}
