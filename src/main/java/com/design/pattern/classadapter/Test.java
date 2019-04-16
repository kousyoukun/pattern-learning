package com.design.pattern.classadapter;

public class Test {
    public static void main(String[] args) {
        StartNode startNode = new Adapter();
        startNode.exec();
    }
}
