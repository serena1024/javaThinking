package com.yy.chapter11���ж���;
//Collection�ӿڸ��������еĸ���==== һ�ִ��һ�����ķ�ʽ���������������Integer���������һ��Collection
//��Ȼ���ӡ�����������������е�Ԫ��

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c =new ArrayList<Integer>();
		for(int i= 0;i < 10 ; i++) {
			c.add(i);
		}
		for(Integer i : c) {
			System.out.println("" + i);
		}
	}
	//��Ϊ���ʵ��ֻʹ����Collection����������κμ̳���Collection��Ķ��󶼿�����������������ArrayList�����������������
}
