package com.design.pattern.chain;

public abstract class Handler {
    protected Handler successor;

    public abstract boolean checkStatus();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

}
