package com.yy.chapter11���ж���;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/***
 * ���Integer����Hash Set��ʾ��
 * 
 * */
public class SetOfInteger {
	public static void main(String[] args) {
		Random rand = new  Random(47);
		//����밴��˳������ͻ���TreeSet
		Set<Integer> intSet = new HashSet<>();
		for(int i= 0 ;i < 10000 ; i ++) {
			intSet.add(rand.nextInt(30));
		}
		System.out.println(intSet);
	}
	/*****
	 * 0-29֮���10000�����������ӵ���set�У�����ÿ����ֻ��һ��ʵ�������ڽ���С����������˳����û�й��ɵ�
	 * HashSetʹ����ɢ�к�����TreeSet��Ԫ�ش洢�ں�����У�����
	 * 
	 * */
	
}
