package com.yy.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/****
 * 利用map实现 Random是键，值是该数字出现的次数，测试Random的随机性
 * */
public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer,Integer> m = new HashMap<>();
		for(int i = 0 ; i< 10000 ; i ++ ) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		System.out.println(m);
	}
}
