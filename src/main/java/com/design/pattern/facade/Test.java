package com.design.pattern.facade;

public class Test {
    public static void main(String[] args) {
        NodeFacader nodeFacader = new NodeFacader();

        nodeFacader.execStartNode();
        nodeFacader.execEndNode();
    }
}
