package com.yy.chapter11���ж���;

import java.util.HashMap;
import java.util.Map;

import net.mindview.util.Print;


//�鿴�Ƿ����ĳ��������ֵ
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
