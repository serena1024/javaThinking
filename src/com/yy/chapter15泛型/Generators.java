package com.yy.chapter15泛型;

import java.util.ArrayList;
import java.util.Collection;

import com.yy.chapter15泛型.泛型接口153.Coffee;
import com.yy.chapter15泛型.泛型接口153.CoffeeGenerator;
import com.yy.chapter15泛型.泛型接口153.Generator;

public class Generators {

	// fill鏂规硶鏄?忔槑鐨勫簲鐢ㄤ簬鐢熸垚鍣ㄧ殑
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
