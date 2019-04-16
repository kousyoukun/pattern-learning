package com.design.pattern.chain;

public class SuperJob extends AbstractJob {
    private String superJobParam;

    public String getSuperJobParam() {
        return superJobParam;
    }

    public void setSuperJobParam(String superJobParam) {
        this.superJobParam = superJobParam;
    }
}
