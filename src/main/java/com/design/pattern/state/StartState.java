package com.design.pattern.state;

public class StartState implements State {
    public void changeState(Context context) {
        System.out.println("job is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }
}
