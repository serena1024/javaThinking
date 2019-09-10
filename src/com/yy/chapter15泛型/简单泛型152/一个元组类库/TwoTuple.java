package com.yy.chapter15泛型.简单泛型152.一个元组类库;
/**
 * 一个二维元组，能够持有两个对象
 * ***/
public class TwoTuple<A,B> {
	public final A first;
	public final B second;
	public TwoTuple(A a ,B b) {
		first = a;
		second = b;
	}
	public String toString() {
		return "first" + first +",second" + second;
	}
}

