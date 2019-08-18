package com.yy.chapter11持有对象;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 * 你可以通过调用ListIterator()产生一个指向List开始处的ListIterator ，并且还可以通过调用ListIterator（n）方法创建
一个一开始就指向列表索引为n的元素处的 	ListIterator。
 * 
 * **/
public class ListIteration {
	public static void main(String[] args) {
		List<Pet> pList = new ArrayList<Pet>();
		Pet p1 =new Pet();
		Pet p2 =new Pet();
		Pet p3 =new Pet();
		p1.setName("Angle");
		p2.setName("boll");
		p3.setName("candy");
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		ListIterator<Pet> li = pList.listIterator();
		while(li.hasNext()) {
			System.out.println("Name" + li.next().getName() + "nextIndex" + li.nextIndex() + "previousIndex"
					 + li.previousIndex());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous().getName());
		}
		while(li.hasNext()) {
			li.next();
			li.set(p3);
		}
		System.out.println(pList.toString());
	}
}
