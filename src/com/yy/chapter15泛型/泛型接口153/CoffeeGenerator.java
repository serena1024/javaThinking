package com.yy.chapter15泛型.泛型接口153;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>,Iterator<Coffee>{
	private Class[] types = {
			Latte.class,Mocha.class
	};
	private static Random rand  = new Random(47);
	public CoffeeGenerator() {}
	private int size = 0;
	public CoffeeGenerator(int sz){
		this.size = sz;
	}
	@Override
	public Coffee next() {
		Coffee c = null;
		try {
			c =  (Coffee) types[rand.nextInt(types.length)].newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return c;
	}
	class CoffeeIterator implements Iterator<Coffee>{
		int count = size;
		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	public Iterator<Coffee> iterator(){
		return new CoffeeIterator();
	}
	@Override
	public boolean hasNext() {
		return false;
	}
	public static void main(String[] args) {
		CoffeeGenerator g = new CoffeeGenerator();
		for(int i = 0 ;i < 2; i++) {
			System.out.println(g.next());
		}
//		for(Coffee c : new CoffeeGenerator(5)) {
//			System.out.println(c);
//		}
	}
}
