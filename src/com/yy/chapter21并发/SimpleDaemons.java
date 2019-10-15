package com.yy.chapter21并发;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{

    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread()+ ":" +this );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //必须在线程启动前调用setDaemon（），才能把它设置为后台线程。
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0 ; i< 10 ;i ++){
            Thread daemon  = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
