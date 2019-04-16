package com.design.pattern.command;

public class Test {
    public static void main(String[] args) {
        Playbook playbook = new Playbook();

        Job job = new Job(playbook);
        SuperJob superJob = new SuperJob(playbook);

        Action act = new Action();
        act.addAction(job);
        act.addAction(superJob);

        act.act();
    }
}
