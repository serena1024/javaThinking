package com.yy.chapter15����.�򵥷���152.һ��Ԫ�����;

class Amphibian{}
class Vehicle{}

public class TupleTest {
	static TwoTuple<String, Integer> f(){
		return new TwoTuple<String, Integer>("hi",47);
	}
	static ThreeTuple<Amphibian,String, Integer> g(){
		return new ThreeTuple<Amphibian,String, Integer>(new Amphibian(),"hi",47);
	}
	public static void main(String[] args) {
		TwoTuple<String,Integer>  t =f();
		System.out.println(t);
		System.out.println("====================");
		System.out.println(g());
	}
}
