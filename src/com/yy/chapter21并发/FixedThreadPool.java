package com.yy.chapter21并发;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//有限的线程集来执行所提交的任务
    public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i = 0 ; i < 5 ; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
