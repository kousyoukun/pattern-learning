package com.design.pattern.builder;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        NodeBuilder builder = new ConcreteNodeBuilder();

        director.construct(builder);

        Playbook playbook = builder.getPlaybook();
        playbook.show();
    }
}
