package com.yy.chapter15����.�򵥷���152.һ��Ԫ�����;

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
//���Ը��ݼ̳еĹ�ϵ��������Ԫ��ĳ���