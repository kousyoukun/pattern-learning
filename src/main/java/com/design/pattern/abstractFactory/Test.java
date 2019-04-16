package com.design.pattern.abstractFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory jobFactory = FactoryProducer.getFactory("job");
        Job job = jobFactory.createJob("job");
        job.run();
        AbstractFactory nodeFactory = FactoryProducer.getFactory("node");
        Node start = nodeFactory.createNode("start");
        start.exec();
    }
}
