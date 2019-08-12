package com.yy.chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;


/****
 * 现在考虑建一个display方法，它不必知晓容器的确切类型
 * */
public class CrossContainerIteration {
	public static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.println("&&&&" + p.getName());
		}
	}
	public static void main(String[] args) {
		ArrayList<Pet> aa = new ArrayList<Pet>();
		Pet p1 =new Pet();
		Pet p2 =new Pet();
		Pet p3 =new Pet();
		p1.setName("Angle");
		p2.setName("boll");
		p3.setName("candy");
		aa.add(p1);
		aa.add(p2);
		aa.add(p3);
		LinkedList<Pet> ll = new LinkedList<Pet>(aa);
		HashSet<Pet> hh = new HashSet<Pet>(aa);
		TreeSet<Pet> tt = new TreeSet<Pet>(aa);
		display(aa.iterator());
		display(ll.iterator());
		display(hh.iterator());
		display(tt.iterator());
	}
}
