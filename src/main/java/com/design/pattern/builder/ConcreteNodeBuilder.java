package com.design.pattern.builder;

public class ConcreteNodeBuilder extends NodeBuilder {

    private Playbook playbook = new Playbook();

    public void installStartNode() {
        playbook.install("开始节点");
    }

    public void installScriptNode() {
        playbook.install("脚本节点");
    }

    public void installEndNode() {
        playbook.install("结束节点");
    }

    @Override
    public Playbook getPlaybook() {
        return playbook;
    }
}
