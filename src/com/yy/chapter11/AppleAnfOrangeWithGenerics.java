package com.yy.chapter11;

import java.util.ArrayList;

//使用泛型
public class AppleAnfOrangeWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0 ;i< 3;i++) {
			apples.add(new Apple());
			//apples.add(new Orange()); 使用泛型之后就只能添加指定的apple了，不可以添加orange
		}
		for(int i = 0 ;i< apples.size() ;i ++) {
			System.out.println(apples.get(i).id()); //这里直接得到的就是Apple对象
		}
	}
}
