package com.yy.chapter11;

import java.util.ArrayList;

//ʹ�÷���
public class AppleAnfOrangeWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0 ;i< 3;i++) {
			apples.add(new Apple());
			//apples.add(new Orange()); ʹ�÷���֮���ֻ�����ָ����apple�ˣ����������orange
		}
		for(int i = 0 ;i< apples.size() ;i ++) {
			System.out.println(apples.get(i).id()); //����ֱ�ӵõ��ľ���Apple����
		}
	}
}
