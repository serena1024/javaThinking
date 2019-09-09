package com.yy.chapter15泛型.简单泛型152;
/***
 * 简单泛型示例
 * */
public class Holder2 {
	private Object a ;
	public Holder2(Object a) {
		this.a = a;
	}
	public Object get() {
		return a;
	}
	public void set(Object a) {
		this.a = a;
	}
	public static void main(String[] args) {
		Holder2 h2 = new Holder2(new AutoMobile());
		AutoMobile a = (AutoMobile) h2.get();
		h2.set("Not an AutoMobile");
		String s = (String) h2.get();
		h2.set(1);//Autoboxes to Integer
		Integer x = (Integer) h2.get();
	}
	//现在holder2可以存储任何类型的对象。
}
