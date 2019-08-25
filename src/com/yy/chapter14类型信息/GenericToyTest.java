package com.yy.chapter14类型信息;
/**
 * 当你将泛型用于Class对象时，newINstance将返回该对象的确切类型。
 * ***/
public class GenericToyTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<FancyToy> ftClass = FancyToy.class;
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
//		Class<Toy> up2 = ftClass.getSuperclass();
		Object obj = up.newInstance();
	}
}
