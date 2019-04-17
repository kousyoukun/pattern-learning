package com.design.pattern.visitor;

public class JobVisitorImpl implements JobVisitor {
    public void visit(StartNode startNode) {
        System.out.println("run start node");
    }

    public void visit(EndNode endNode) {
        System.out.println("run end node");
    }

    public void visit(ScriptNode scriptNode) {
        System.out.println("run script node");
    }

    public void visit(Job job) {
        System.out.println("run job");
    }
}
