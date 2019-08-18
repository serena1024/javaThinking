package com.yy.chapter11持有对象;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//11.12
public class InterfaceVSIterator {
	public static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.print("Iterator:" + p.getName());
		}
		System.out.println();
	}
	public static void display(Collection<Pet> pets) {
		for(Pet p : pets) {
			System.out.print("Collection : " + p.getName());
		}
		System.out.println();
	}
	public static void main(String[] args) {
		List<Pet> petList = new ArrayList<Pet>();
		Pet p1 =new Pet();
		Pet p2 =new Pet();
		Pet p3 =new Pet();
		p1.setName("Angle");
		p2.setName("boll");
		p3.setName("candy");
		petList.add(p1);
		petList.add(p2);
		petList.add(p3);
		Set<Pet> petSet = new HashSet<>(petList);
		Map<String, Pet> petMap = new LinkedHashMap<>();
		String[] names = ("ralph,eric,robinlacey,britney,sam,spot,fluffy").split(" ");
		for(int i = 0; i< names.length ; i ++) {
			petMap.put(names[i], petList.get(i));
		}
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		System.out.println(petMap);
		System.out.println(petMap.keySet());
		display(petMap.values());
		display(petMap.values().iterator());
	}
}
