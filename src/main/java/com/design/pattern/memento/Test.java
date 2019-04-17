package com.design.pattern.memento;

public class Test {
    public static void main(String[] args) {
        ExecJob execJob = new ExecJob();
        StateTaker stateTaker = new StateTaker();

        execJob.setState("running #1");
        execJob.setState("running #2");
        execJob.setState("running #3");
        stateTaker.add(execJob.saveStateToMemnto());
        execJob.setState("running #4");
        stateTaker.add(execJob.saveStateToMemnto());
        execJob.setState("error");

        System.out.println("Current state: " + execJob.getState());
        execJob.getStateFromMemnto(stateTaker.get(0));
        System.out.println("First saved state: " + execJob.getState());
        execJob.getStateFromMemnto(stateTaker.get(1));
        System.out.println("Second saved state: " + execJob.getState());
    }
}
