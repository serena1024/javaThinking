package com.yy.chapter11持有对象;
//Collection接口概括了序列的概念==== 一种存放一组对象的方式。下面这个例子用Integer对象填充了一个Collection
//，然后打印出所产生容器中所有的元素

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c =new ArrayList<Integer>();
		for(int i= 0;i < 10 ; i++) {
			c.add(i);
		}
		for(Integer i : c) {
			System.out.println("" + i);
		}
	}
	//因为这个实例只使用了Collection方法，因此任何继承自Collection类的对象都可以正常工作，但是ArrayList是最基本的序列类型
}
