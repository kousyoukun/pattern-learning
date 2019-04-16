package com.design.pattern.chain;

public class Job extends AbstractJob {
    private String jobParam;

    public String getJobParam() {
        return jobParam;
    }

    public void setJobParam(String jobParam) {
        this.jobParam = jobParam;
    }
}
