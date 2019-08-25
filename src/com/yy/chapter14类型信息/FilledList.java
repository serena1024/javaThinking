package com.yy.chapter14类型信息;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {
	private static long counter;
	private final long id = counter++;
	
	public CountedInteger() {
		super();
	}

	public String toString() {
		return Long.toString(id);
	}
}
public class FilledList<T>{
	private Class<T> type;
	public FilledList(Class<T> type) {
		this.type =type;
	}
	
	public FilledList() {
		super();
	}

	public List<T> create(int nElements){
		List<T> result = new ArrayList<T>();
		for(int i = 0 ; i < nElements ; i++ ) {
			try {
				result.add(type.newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	public static void main(String[] args) {
		FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(fl.create(15));
	}
	//注意，这个类必须假设与它同一工作的任何类型都具有一个默认的构造器（无参构造器），否则就会得到一个异常，但是编译器对该程序不会产生
//	 任何警告信息。
	
}
