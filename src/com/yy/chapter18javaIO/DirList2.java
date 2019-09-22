package com.yy.chapter18javaIO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {
    //filter的参数必须是final的这是匿名内部类必须的
    public static FilenameFilter filter (final String regex){
        return new FilenameFilter() {
            //正则表达式的支持Pattern 和Matcher
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        System.out.println("path" + path);
        if(args.length == 0){
            // 	public String[] list() 回由此抽象路径名所表示的目录中的文件和目录的名称所组成字符串数组。
            list = path.list();
        }else{
//            public String[] list(FilenameFilter filter)
//            返回由包含在目录中的文件和目录的名称所组成的字符串数组，这一目录是通过满足指定过滤器的抽象路径名来表示的。
            list = path.list(filter(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            System.out.println(dirItem);
        }
    }
}
