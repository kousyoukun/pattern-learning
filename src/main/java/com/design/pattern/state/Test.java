package com.design.pattern.state;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.changeState(context);
        System.out.println(context.getState().toString());
        EndState endState = new EndState();
        endState.changeState(context);
        System.out.println(context.getState().toString());
    }
}
