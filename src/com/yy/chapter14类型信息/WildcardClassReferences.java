package com.yy.chapter14类型信息;
/**
 * 通配符
 * **/
public class WildcardClassReferences {
	public static void main(String[] args) {
		Class<?> intClass = int.class;
		intClass  = double.class;
		//因为使用了通配符，所以不报错。
		}
}
