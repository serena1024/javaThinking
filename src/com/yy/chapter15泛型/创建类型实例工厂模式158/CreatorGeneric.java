package com.yy.chapter15����.��������ʵ������ģʽ158;
/**
 * ģ�巽�����ģʽ���������ʵ���У�get()��ģ�巽������create()���������ж���ģ����������������͵Ķ���
 * **/

abstract class GenericWithCreate<T>{
	final T element;
	GenericWithCreate(){
		element = create();
	}
	abstract T create();
}

class X {}

class Creator extends GenericWithCreate<X>{

	@Override
	X create() {
		return new X();
	}
	void f() {
		System.out.println("===" + element.getClass().getSimpleName());
	}
	
}
public class CreatorGeneric {
	public static void main(String[] args) {
		Creator c = new  Creator();
		c.f();
	}
}
