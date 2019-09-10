package com.yy.chapter15泛型.泛型接口153;

public class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {
		return getClass().getSimpleName() + "Coffee [id=" + id + "]";
	}
}
