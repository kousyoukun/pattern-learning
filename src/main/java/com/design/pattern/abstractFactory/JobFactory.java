package com.design.pattern.abstractFactory;

public class JobFactory extends AbstractFactory {

    public Node createNode(String nodeType) {
        return null;
    }

    public Job createJob(String jobType) {
        if ("job".equals(jobType)) {
            return new NormalJob();
        } else if ("superJob".equals(jobType)) {
            return new SuperJob();
        }
        return null;
    }
}
