package com.yy.chapter11持有对象;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/****
 * 迭代器实例
 * */
public class SimpleIteration {
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
		Iterator <Pet> i = pList.iterator();
		while(i.hasNext()) {
			Pet p = i.next();
			System.out.println("===" + p.getName());
		}
		for(Pet t : pList) {
			System.out.println("***" + t.getName());
		}
		i = pList.iterator();
		for(int j= 0; j<2 ; j++) {
			i.next();
			i.remove();
		}
		System.out.println("###" + i);
	}
}
