package com.yy.chapter11持有对象;

public class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
}
