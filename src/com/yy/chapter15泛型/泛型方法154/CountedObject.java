package com.yy.chapter15泛型.泛型方法154;
/**
 * 计算对象被new的次数
 * **/
public class CountedObject {
	private static long counter= 0;
	private final long id = counter++;
	public long id() {
		return id;
	}
	@Override
	public String toString() {
		return "CountedObject [id=" + id + "]";
	}
	
}
