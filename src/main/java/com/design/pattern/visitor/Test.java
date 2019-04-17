package com.design.pattern.visitor;

public class Test {
    public static void main(String[] args) {
        Playbook playbook = new Job();
        playbook.run(new JobVisitorImpl());
    }
}
