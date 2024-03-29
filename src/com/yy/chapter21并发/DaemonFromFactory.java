package com.yy.chapter21����;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0 ; i < 10; i++ ){
            exec.execute(new DaemonFromFactory());
        }
        System.out.println("All daemons started   ");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
