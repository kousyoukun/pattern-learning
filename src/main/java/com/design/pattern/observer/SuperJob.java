package com.design.pattern.observer;

public class SuperJob extends JobState {
    public void changeState(boolean enable) {
        setEnable(enable);
        System.out.println("update super job :" + isEnable());
    }
}
