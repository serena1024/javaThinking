package com.yy.chapter18javaIO;

import java.io.*;

/**
 * 基本文件输出
 * **/
public class BasicFileOutput {
    static String file = "F:\\BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("F:\\ideaForProject\\javaThinking\\src\\com\\yy\\chapter18javaIO\\BasicFileOutput.java")));
        PrintWriter out =  new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int linecount = 1;
        String s;
        while ( (s= in.readLine()) != null){
            out.println(linecount++ +":" + s);
        }
        out.close();;
        System.out.println(BufferedInputFile.read(file));
    }
}
