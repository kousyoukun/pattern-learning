package com.design.pattern.command;

public class SuperJob implements AbstractJob {
    private Playbook playbook;

    public SuperJob(Playbook playbook) {
        this.playbook = playbook;
    }

    public void run() {
        playbook.runSuperJob();
    }
}
