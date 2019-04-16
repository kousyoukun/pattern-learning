package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSubject {
    private List<JobState> jobStateList = new ArrayList<JobState>();

    public void attach(JobState jobState) {
        jobStateList.add(jobState);
    }

    public void detach(JobState jobState) {
        jobStateList.remove(jobState);
    }

    public void change(boolean enable) {
        for (JobState jobState : jobStateList) {
            jobState.changeState(enable);
        }
    }
}
