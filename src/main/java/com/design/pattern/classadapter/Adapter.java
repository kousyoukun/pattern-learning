package com.design.pattern.classadapter;

public class Adapter extends OldStartNode implements StartNode {
    public void exec() {
        System.out.println("新接口执行老接口");
        this.run();
    }
}
