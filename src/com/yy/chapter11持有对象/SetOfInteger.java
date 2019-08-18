package com.yy.chapter11持有对象;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/***
 * 存放Integer对象Hash Set的示例
 * 
 * */
public class SetOfInteger {
	public static void main(String[] args) {
		Random rand = new  Random(47);
		//如果想按照顺序输出就换成TreeSet
		Set<Integer> intSet = new HashSet<>();
		for(int i= 0 ;i < 10000 ; i ++) {
			intSet.add(rand.nextInt(30));
		}
		System.out.println(intSet);
	}
	/*****
	 * 0-29之间的10000个随机数被添加到了set中，但是每个数只有一个实例出现在结果中。而且输出的顺序是没有规律的
	 * HashSet使用了散列函数，TreeSet将元素存储在红黑树中，、。
	 * 
	 * */
	
}
