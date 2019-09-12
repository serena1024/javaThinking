package com.yy.chapter15泛型.创建类型实例工厂模式158;
/**
 * 工厂模式实现实例化 1 
 * **/

class ClassASFactory<T>{
	T x;
	public ClassASFactory(Class<T> kind){
		 try {
			x = kind.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

class Employee{}

public class InstantiateGenericType {
	public static void main(String[] args) {
		ClassASFactory<Employee> employee = new ClassASFactory(Employee.class);
		System.out.println("==========employee==success==========");
		ClassASFactory<Integer> integer = new ClassASFactory(Integer.class);
		//Integer报错 因为Integer没有默认的构造器，所以以上的工厂模式需要有默认构造器的类才能使用
		
	}
}
