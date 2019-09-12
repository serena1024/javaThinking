package com.yy.chapter15泛型.创建类型实例工厂模式158;
/***
 * 工厂模式实例化 2 ---显示工厂模式
 * */
interface FactoryI<T>{
	T create();
}
class Foo2<T>{
	private T x;
	public <F extends FactoryI<T>> Foo2(F factory){
		x = factory.create();
	}
}

class IntegerFactory implements FactoryI<Integer>{
	@Override
	public Integer create() {
		return new Integer(0);
	}
}

class Widget{
	public static class Factory implements FactoryI<Widget>{
		@Override
		public Widget create() {
			return new Widget();
		}
	}
}
public class FactoryConstraint {
	public static void main(String[] args) {
		new Foo2<Integer>(new IntegerFactory());
		new Foo2<Widget>(new Widget.Factory());
//		new Foo2<String>(String.class);
	}
	//显示的工厂对象，得到了编译器的检查<String>就会报错
}
