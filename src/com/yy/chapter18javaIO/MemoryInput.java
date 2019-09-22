package com.yy.chapter18javaIO;

import java.io.IOException;
import java.io.StringReader;

/**
 * ¥”ƒ⁄¥Ê ‰»Î
 * */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("F:\\ideaForProject\\javaThinking\\src\\com\\yy\\chapter18javaIO\\MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1){
            System.out.println((char)c);
        }
    }
}
