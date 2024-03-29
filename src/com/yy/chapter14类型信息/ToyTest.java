package com.yy.chapter14类型信息;

interface HasBatteries{}
interface WaterProof{}
interface Shoots{}


class Toy{
	Toy(){}
	Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries,WaterProof,Shoots{
	FancyToy(){
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		//isInterface（）是否是接口
		System.out.println("Class name : " + cc.getName() + "is interface ?[" + cc.isInterface() + "]");
		//Simple name:FancyToy
		System.out.println("Simple name:" + cc.getSimpleName());
		//Canonical namecom.yy.chapter14类型信息.FancyToy
		System.out.println("Canonical name" + cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			//forName中必须使用全限定名
			c = Class.forName("com.yy.chapter14类型信息.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("can not find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		//getInterfaces() 返回对象中包含的接口的list
		for(Class face : c.getInterfaces()) {
			printInfo(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("can not instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("can not access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}
