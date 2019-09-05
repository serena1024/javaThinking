package com.yy.chapter14类型信息;
/***
 * 
 * 工厂类 在下面这个非常简单的版本中，工厂方法就是Factory接口中的create(),泛型参数T使得
 * create()可以在每种Factory实现中返回不同的类型
 * ***/
public interface Factory<T> {
	T create();
}
