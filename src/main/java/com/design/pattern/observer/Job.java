package com.design.pattern.observer;

public class Job extends JobState {
    public void changeState(boolean enable) {
        setEnable(enable);
        System.out.println("update job :" + isEnable());
    }
}
