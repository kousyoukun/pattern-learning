package com.design.pattern.proxy;

public class Job implements JobAPI {
    public void run() {
        System.out.println("执行作业");
    }
}
