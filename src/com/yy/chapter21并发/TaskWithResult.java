package com.yy.chapter21����;

import java.util.concurrent.Callable;

//ִ���߳�֮���з���ֵʾ��
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id ){
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        return "result  of TaskWithResult �� " + id;
    }
}
