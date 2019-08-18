package com.yy.chapter11持有对象;

import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

//产生每个元素都是唯一的列表
public class UniqueWords {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(
			new TextFile("D:\\workplace\\javaThinking\\src\\com\\yy\\chapter11\\SetOperations.java","\\W+"));
		System.out.println(words);
		
	}
	/**
	 * TextFile 继承自List<String>，其构造器将打开文件，并根据正则表达式“\\W+”,将其断开为单词。
	 * **/
}
