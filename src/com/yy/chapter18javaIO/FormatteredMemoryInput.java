package com.yy.chapter18javaIO;

import java.io.*;

/**
 * 格式化的内存输入
 * */
public class FormatteredMemoryInput {
    public static void main(String[] args){
        DataInputStream in = null;
        try {
            in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("F:\\ideaForProject\\javaThinking\\src\\com\\yy\\chapter18javaIO\\FormatteredMemoryInput.java").getBytes()));
            while (true){
                System.out.println((char) in.readByte());
            }
        } catch (EOFException e) {
            System.out.println("End of stream");
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
