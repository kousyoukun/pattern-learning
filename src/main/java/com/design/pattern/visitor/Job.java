package com.design.pattern.visitor;

public class Job implements Playbook {

    private Playbook[] parts;

    public Job() {
        parts = new Playbook[]{new StartNode(), new EndNode(), new ScriptNode()};
    }

    public void run(JobVisitor jobVisitor) {
        for (Playbook part : parts) {
            part.run(jobVisitor);
        }
        jobVisitor.visit(this);
    }
}
