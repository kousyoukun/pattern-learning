package com.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Action {
    private List<AbstractJob> jobList = new ArrayList<AbstractJob>();

    public void addAction(AbstractJob job) {
        jobList.add(job);
    }

    public void act() {
        for (AbstractJob job : jobList) {
            job.run();
        }
    }
}
