package com.yy.chapter21并发;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for(int i = 0 ;i < 5 ;i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
    //输出说明不同任务执行在线程被换进换出时混在了一起。这种交换是由线程调度器自动控制的。如果在你的机器上有多个处理器，
//    线程调度器将会在这些处理器之间默默地分发线程。
}
