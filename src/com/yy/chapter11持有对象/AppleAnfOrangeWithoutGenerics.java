package com.yy.chapter11���ж���;

import java.util.ArrayList;

// ��ʹ�÷���
public class AppleAnfOrangeWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0 ;i< 3;i++) {
			apples.add(new Apple());
			apples.add(new Orange());
		}
		for(int i = 0 ;i< apples.size() ;i ++) {
			((Apple)apples.get(i)).id(); //�ٵ���Apple��id����֮ǰ����ǿת �� ��Orange����ת����Apple�������ǻᱨ��
		}
	}
}
