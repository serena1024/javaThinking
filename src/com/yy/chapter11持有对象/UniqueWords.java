package com.yy.chapter11���ж���;

import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

//����ÿ��Ԫ�ض���Ψһ���б�
public class UniqueWords {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(
			new TextFile("D:\\workplace\\javaThinking\\src\\com\\yy\\chapter11\\SetOperations.java","\\W+"));
		System.out.println(words);
		
	}
	/**
	 * TextFile �̳���List<String>���乹���������ļ���������������ʽ��\\W+��,����Ͽ�Ϊ���ʡ�
	 * **/
}
