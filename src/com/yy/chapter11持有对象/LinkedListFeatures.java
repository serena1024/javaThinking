package com.yy.chapter11持有对象;

import java.util.LinkedList;

/***
 * 针对11.7的差异举例 
 * */
public class LinkedListFeatures {
	public static void main(String[] args) {
		Pet p1 =new Pet();
		Pet p2 =new Pet();
		Pet p3 =new Pet();
		Pet p4 =new Pet();
		Pet p5 =new Pet();
		p1.setName("1");
		p2.setName("2");
		p3.setName("3");
		p4.setName("4");
		p5.setName("5");
		LinkedList<Pet> pets = new LinkedList<Pet>();
		pets.add(p1);
		pets.add(p2);
		pets.add(p3);
		pets.add(p4);
		pets.add(p5);
		System.out.println("pets.getFirst()" + pets.getFirst().getName());
		System.out.println("pets.element()" + pets.element().getName());
		System.out.println("pets.peek()" + pets.peek().getName());
		System.out.println("pets.remove()" + pets.remove().getName());
		System.out.println("pets.removeFirst()" + pets.removeFirst().getName());
		System.out.println("pets.poll()" + pets.poll().getName());
		pets.addFirst(new Pet("6"));
		//在尾端追加一个对象
		pets.offer(p5);
		for(Pet p : pets) {
			System.out.println("==" + p.getName());
		}
		
	}
}
