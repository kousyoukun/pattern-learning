package com.design.pattern.builder;

public abstract class NodeBuilder {

    public abstract void installStartNode();

    public abstract void installScriptNode();

    public abstract void installEndNode();

    public abstract Playbook getPlaybook();
}
