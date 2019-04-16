package com.design.pattern.observer;

public class Test {
    public static void main(String[] args) {
        Job job = new Job();
        SuperJob superJob = new SuperJob();

        JobSubject jobSubject = new JobSubject();
        jobSubject.attach(job);
        jobSubject.attach(superJob);

        jobSubject.change(false);
    }
}
