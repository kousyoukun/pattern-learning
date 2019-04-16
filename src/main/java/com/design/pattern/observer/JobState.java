package com.design.pattern.observer;

public abstract class JobState {
    private boolean enable = true;

    public abstract void changeState(boolean enable);

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
