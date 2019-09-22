package com.yy.chapter18javaIO;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * 文件读写使用工具
 * */
public class TestFile extends ArrayList<String> {
    //read a file as a single String
    public static String read(String filename) throws IOException {
        StringBuilder sb =  new StringBuilder();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(new File(filename)));
            String s;
            while ((s = in.readLine()) != null){
                sb.append(s);
                sb.append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            in.close();
        }
        return sb.toString();
    }
    //wrote a single file in one method call
    public static void  write(String filename ,String text){
        try {
            PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile());
            out.print(text);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    // read a file ,split by any regular expression
    public TestFile(String filename ,String splitter) throws IOException {
        super(Arrays.asList(read(filename).split(splitter)));
        if(get(0).equals(""))
            remove(0);
    }
    //normally read by lines
    public TestFile(String filename) throws IOException {
        this(filename,"\n");
    }
    //
    public void write(String filename) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile());
        for(String item : this)
        {   try{
            out.print(item);
            }finally {
            out.close();
        }
        }

    }

    public static void main(String[] args) throws IOException {
        String file = read("F:\\ideaForProject\\javaThinking\\src\\com\\yy\\chapter18javaIO\\TestFile.java");
        write("F:\\test.txt",file);
        TestFile text =     new TestFile("F:\\test.txt");
        text.write("F:\\test2.txt");
        TreeSet<String> words = new TreeSet<String>(new TestFile("F:\\ideaForProject\\javaThinking\\src\\com\\yy\\chapter18javaIO\\TestFile.java","\\W"));
        System.out.println(words.headSet("a"));

    }

}
