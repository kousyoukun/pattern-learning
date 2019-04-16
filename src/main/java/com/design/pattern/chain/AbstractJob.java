package com.design.pattern.chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractJob {
    private String name;
    private String type;
    private boolean status;
    protected AbstractJob successor;

    public AbstractJob getSuccessor() {
        return successor;
    }

    public void setSuccessor(AbstractJob successor) {
        this.successor = successor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean checkStatus() {
        if (!status) {
            return status;
        }
        if (successor != null) {
                System.out.println("next " + getName());
                return successor.checkStatus();
        }
        return true;
    }
}
