package com.yy.chapter14类型信息;

import java.util.HashMap;

import com.yy.chapter14类型信息.Pet;

/***
 * 对Pet进行计数
 * **/
public class PetCount {
	static class PetCounter extends HashMap<String,Integer>{
		public void count(String type) {
			Integer quantity = get(type);
			if(quantity == null ) {
				put(type , 1);		
			}else {
				put(type , quantity + 1);
			}
		}
	}
	public static void countPets(PetCreater creater) {
		PetCounter counter = new PetCounter();
		for(Pet pet : creater.createArray(20)) {
			System.out.println(pet.getClass().getSimpleName() + "======");
			if(pet instanceof Pet) {
				counter.count("Pet");
			}
			if(pet instanceof Dog) {
				counter.count("Dog");
			}
			if(pet instanceof Mutt) {
				counter.count("Mutt");
			}
			if(pet instanceof Pug) {
				counter.count("Pug");
			}
			if(pet instanceof Cat) {
				counter.count("Cat");
			}
			if(pet instanceof Manx) {
				counter.count("Manx");
			}
			if(pet instanceof Crymric) {
				counter.count("Crymric");
			}
			if(pet instanceof Rodent) {
				counter.count("Rodent");
			}
			if(pet instanceof Rat) {
				counter.count("Rat");
			}
			if(pet instanceof Mouse) {
				counter.count("Mouse");
			}
			if(pet instanceof Hamster) {
				counter.count("Hamster");
			}
		}
		System.out.println("=====counter====" + counter);
	}
	public static void main(String[] args) {
		countPets(new ForNameCreator());
	}
}
