package com.yy.chapter15泛型.简单泛型152.一个元组类库;

public class ThreeTuple<A,B,C> extends TwoTuple<A, B>{
	public final C third;
	public ThreeTuple(A a, B b,C c) {
		super(a, b);
		third = c;
	}
	public String toString() {
		return "first" + first +",second" + second + ",third" + third;
	}
}
//可以根据继承的关系轻松增加元组的长度