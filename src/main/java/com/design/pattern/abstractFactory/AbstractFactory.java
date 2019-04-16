package com.design.pattern.abstractFactory;

public abstract class AbstractFactory {
    public abstract Node createNode(String nodeType);
    public abstract Job createJob(String jobType);
}
