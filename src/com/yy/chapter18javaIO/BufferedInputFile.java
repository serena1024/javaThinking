package com.yy.chapter18javaIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/***
 * 缓冲输入文件
 * */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine()) != null){
            //必须添加换行符，因为readLine已经删掉了
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("F:\\ideaForProject\\javaThinking\\src\\com\\yy\\chapter18javaIO\\BufferedInputFile.java")   );
    }
}
