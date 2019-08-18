package com.yy.chapter11持有对象;

import java.util.HashMap;
import java.util.Map;

import net.mindview.util.Print;


//查看是否包含某个键或者值
public class PetMap {
	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<>();
		petMap.put("My cat", new Pet("Tom"));
		petMap.put("My Dog", new Pet("Donggua"));
		petMap.put("My mouse", new Pet("Jerry"));
		Pet dog = petMap.get("My Dog");
		System.out.println(petMap.containsKey("My Dog"));
		System.out.println(petMap.containsValue(dog));
	}
}
