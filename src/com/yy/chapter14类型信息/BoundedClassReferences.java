package com.yy.chapter14类型信息;

public class BoundedClassReferences {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = double.class;
		//或者任何继承Number的子类都行。
		//向Class引用添加泛型语法的原因仅仅是为了提供编译性的检查，因此如果你操作有误，稍后就会立即发现这一点
		
	}
}	
