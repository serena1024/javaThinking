package com.yy.chapter11���ж���;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<String> (Arrays.asList("1 2 3 4 5 6".split(" ")));
		for(String s : ral) {
			System.out.print(s);
		}
		System.out.println();
		for(String s : ral.reversed()) {
			System.out.print( s);
		}
	}
}
class ReversibleArrayList<T> extends ArrayList<T>{
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	public Iterable<T> reversed(){
		return new Iterable<T>() {
			public Iterator<T> iterator(){
				return new Iterator<T>() {
					int current = size() -1;
					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public T next() {
						return get(current--);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
				
			}
		};
	}
}
