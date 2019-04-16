package com.design.pattern.proxy;

public class JobProxy implements JobAPI {

    public void run() {
        Job job = new Job();
        job.run();
    }
}
