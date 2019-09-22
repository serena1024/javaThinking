package com.yy.chapter18javaIO;

import java.io.*;

//存储和回复数据
public class StoringaAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("F:\\data.txt")));
        out.writeDouble(3.14159);
        out.writeUTF("That was pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2 ");
        out.close();
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("F:\\data.txt")));
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
    }

}
