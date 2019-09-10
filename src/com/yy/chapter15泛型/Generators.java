package com.yy.chapter15����;

import java.util.ArrayList;
import java.util.Collection;

import com.yy.chapter15����.���ͽӿ�153.Coffee;
import com.yy.chapter15����.���ͽӿ�153.CoffeeGenerator;
import com.yy.chapter15����.���ͽӿ�153.Generator;

public class Generators {

	// fill方法是�?�明的应用于生成器的
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen,
			int n) {
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}

	public static void main(String[] args) {
		Collection<Coffee> coffee = fill(new ArrayList<Coffee>(),
				new CoffeeGenerator(), 4);
		for (Coffee c : coffee) {
			System.out.println(c);
		}
	}

}
