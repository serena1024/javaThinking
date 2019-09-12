package com.yy.chapter15泛型.创建类型实例工厂模式158;
/**
 * 模板方法设计模式，在下面的实例中，get()是模板方法，而create()是在子类中定义的，用来产生子类类型的对象
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
