package com.yy.chapter18javaIO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {
    //filter�Ĳ���������final�����������ڲ�������
    public static FilenameFilter filter (final String regex){
        return new FilenameFilter() {
            //������ʽ��֧��Pattern ��Matcher
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
            // 	public String[] list() ���ɴ˳���·��������ʾ��Ŀ¼�е��ļ���Ŀ¼������������ַ������顣
            list = path.list();
        }else{
//            public String[] list(FilenameFilter filter)
//            �����ɰ�����Ŀ¼�е��ļ���Ŀ¼����������ɵ��ַ������飬��һĿ¼��ͨ������ָ���������ĳ���·��������ʾ�ġ�
            list = path.list(filter(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            System.out.println(dirItem);
        }
    }
}
