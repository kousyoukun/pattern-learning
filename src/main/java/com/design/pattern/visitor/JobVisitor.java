package com.design.pattern.visitor;

public interface JobVisitor {
    void visit(StartNode startNode);

    void visit(EndNode endNode);

    void visit(ScriptNode scriptNode);

    void visit(Job job);
}
