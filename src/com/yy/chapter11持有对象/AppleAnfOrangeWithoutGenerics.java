package com.yy.chapter11持有对象;

import java.util.ArrayList;

// 不使用泛型
public class AppleAnfOrangeWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0 ;i< 3;i++) {
			apples.add(new Apple());
			apples.add(new Orange());
		}
		for(int i = 0 ;i< apples.size() ;i ++) {
			((Apple)apples.get(i)).id(); //再调用Apple的id方法之前必须强转 。 将Orange对象转换成Apple再运行是会报错
		}
	}
}
