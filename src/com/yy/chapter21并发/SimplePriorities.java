package com.yy.chapter21并发;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//优先级等级示例
public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;
    public SimplePriorities(int priority){
        this.priority = priority;
    }
    public String toString(){
        //返回的正是执行当前代码指令的线程引用:
        return Thread.currentThread() + " : " + countDown ;
    }
    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true){
            for(int i = 0 ; i< 100000 ; i++){
                d = (Math.PI + Math.E)/(double)i;
                if(i % 1000 == 0){
                    Thread.yield();
                }
            }
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 5 ; i ++ ){
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}
