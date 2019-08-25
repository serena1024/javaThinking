package com.yy.chapter14类型信息;
/*****
 * 泛型
 * */
public class GenericClassReference {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = intClass;
//		genericIntClass = double.class; 报错 illegal
		
	}
}
