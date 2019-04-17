package com.design.pattern.visitor;

public class StartNode implements Playbook {

    public void run(JobVisitor jobVisitor) {
        jobVisitor.visit(this);
    }
}
