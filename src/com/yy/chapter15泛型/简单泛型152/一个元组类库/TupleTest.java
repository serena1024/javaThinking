package com.yy.chapter15泛型.简单泛型152.一个元组类库;

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
