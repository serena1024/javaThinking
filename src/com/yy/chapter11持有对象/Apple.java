package com.yy.chapter11���ж���;

public class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
}
