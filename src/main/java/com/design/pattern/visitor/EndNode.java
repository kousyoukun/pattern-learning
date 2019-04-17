package com.design.pattern.visitor;

public class EndNode implements Playbook {
    public void run(JobVisitor jobVisitor) {
        jobVisitor.visit(this);
    }
}
