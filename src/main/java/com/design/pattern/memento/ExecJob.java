package com.design.pattern.memento;

public class ExecJob {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemnto() {
        return new Memento(state);
    }

    public void getStateFromMemnto(Memento memento) {
        state = memento.getState();
    }
}
