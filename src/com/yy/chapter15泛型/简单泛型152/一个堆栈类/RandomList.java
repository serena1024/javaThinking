package com.yy.chapter15泛型.简单泛型152.一个堆栈类;
/**
 * 如果我们想要构建一个能够应用于各种类型对象的工具
 * 就需要用到泛型
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
	//可以随机返回任意对象本次传的是String，也可以是别的对象
}
