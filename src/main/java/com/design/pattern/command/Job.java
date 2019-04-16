package com.design.pattern.command;

public class Job implements AbstractJob {
    private Playbook playbook;

    public Job(Playbook playbook) {
        this.playbook = playbook;
    }

    public void run() {
        playbook.runJob();
    }
}
