package com.yy.chapter14������Ϣ;

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
		//isInterface�����Ƿ��ǽӿ�
		System.out.println("Class name : " + cc.getName() + "is interface ?[" + cc.isInterface() + "]");
		//Simple name:FancyToy
		System.out.println("Simple name:" + cc.getSimpleName());
		//Canonical namecom.yy.chapter14������Ϣ.FancyToy
		System.out.println("Canonical name" + cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			//forName�б���ʹ��ȫ�޶���
			c = Class.forName("com.yy.chapter14������Ϣ.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("can not find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		//getInterfaces() ���ض����а����Ľӿڵ�list
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
