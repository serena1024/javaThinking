package com.yy.chapter15����.�򵥷���152.һ����ջ��;
/**
 * ���������Ҫ����һ���ܹ�Ӧ���ڸ������Ͷ���Ĺ���
 * ����Ҫ�õ�����
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<>();
	private Random rand = new Random(47);
	public void add(T item) {
		storage.add(item);
	}
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<>();
		for(String s : ("aa bb cc dd").split(" ")) {
			rs.add(s);
		}
		List<String> ll = Arrays.asList(("aa bb cc dd").split(" "));
		for(int i = 0 ; i < ll.size() ;i++) {
			System.out.println(rs.select());
		}
	}
	//�����������������󱾴δ�����String��Ҳ�����Ǳ�Ķ���
}
