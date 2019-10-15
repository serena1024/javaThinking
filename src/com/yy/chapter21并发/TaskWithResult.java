package com.yy.chapter21并发;

import java.util.concurrent.Callable;

//执行线程之后有返回值示例
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id ){
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        return "result  of TaskWithResult ： " + id;
    }
}
