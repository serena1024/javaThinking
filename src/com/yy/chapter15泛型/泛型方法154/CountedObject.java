package com.yy.chapter15����.���ͷ���154;
/**
 * �������new�Ĵ���
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
