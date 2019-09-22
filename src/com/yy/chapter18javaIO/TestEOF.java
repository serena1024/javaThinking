package com.yy.chapter18javaIO;

import java.io.*;

//Testing for  end of file while reading a byte at a time
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("F:\\ideaForProject\\javaThinking\\src\\com\\yy\\chapter18javaIO\\TestEOF.java")));
        while (in.available() != 0){
            System.out.println((char)in.readByte());
        }
    }
}
