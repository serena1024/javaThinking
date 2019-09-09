package com.yy.chapter15泛型.简单泛型152;
/***
 * 类型参数 泛型
 * */
public class Holder3<T> {
	private T a;
	public Holder3(T a) {
		this.a = a ;
	}
	public void set(T a) {
		this.a = a ;
	}
	public T get() {
		return a ;
	}
	public static void main(String[] args) {
		Holder3<AutoMobile> h3 = new Holder3<AutoMobile>(new AutoMobile());
		AutoMobile a = h3.get();//这里不需要强制转换 h3中只能set AutoMobile的对象
	}
}
