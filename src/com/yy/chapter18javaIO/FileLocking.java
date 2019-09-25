package com.yy.chapter18javaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/***
 * ÎÄ¼þ¼ÓËø
 * */
public class FileLocking {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileOutputStream fos = new FileOutputStream("D:\\file.txt");
        FileLock fl =  fos.getChannel().tryLock();
        if(fl != null){
            System.out.println("Locked file");
            TimeUnit.MILLISECONDS.sleep(100);
            fl.release();
            System.out.println("released lock");
        }
        fos.close();
    }
}
