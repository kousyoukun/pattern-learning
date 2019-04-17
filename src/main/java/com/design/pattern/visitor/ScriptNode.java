package com.design.pattern.visitor;

public class ScriptNode implements Playbook {
    public void run(JobVisitor jobVisitor) {
        jobVisitor.visit(this);
    }
}
