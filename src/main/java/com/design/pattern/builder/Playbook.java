package com.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Playbook {
    private List<String> nodes = new ArrayList<String>();

    public void install(String node) {
        nodes.add(node);
    }

    public void show() {
        for (String node : nodes) {
            System.out.println("安装了"+node);
        }
        System.out.println("安装完毕");
    }
}
