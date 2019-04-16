package com.design.pattern.chain;

public class Test {
    public static void main(String[] args) {
        AbstractJob job1 = new Job();
        AbstractJob job2 = new SuperJob();
        AbstractJob job3 = new SuperJob();

        job3.setName("超级作业3");
        job3.setStatus(true);
        job3.setType("超级作业");
        job3.setSuccessor(job2);

        job2.setName("超级作业2");
        job2.setStatus(false);
        job2.setType("超级作业");
        job2.setSuccessor(job1);

        job1.setName("普通作业1");
        job1.setStatus(true);
        job1.setType("普通作业");
        job1.setSuccessor(null);

        System.out.println("作业状态：" + job3.checkStatus());

    }
}
