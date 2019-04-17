package com.design.pattern.state;

public class EndState implements State {
    public void changeState(Context context) {
        System.out.println("job is in end state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "End state";
    }
}
