package com.yy.chapter15����.��������ʵ������ģʽ158;
/**
 * ����ģʽʵ��ʵ���� 1 
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
		//Integer���� ��ΪIntegerû��Ĭ�ϵĹ��������������ϵĹ���ģʽ��Ҫ��Ĭ�Ϲ������������ʹ��
		
	}
}
