package com.yy.chapter14������Ϣ;
/*****
 * ����
 * */
public class GenericClassReference {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = intClass;
//		genericIntClass = double.class; ���� illegal
		
	}
}
