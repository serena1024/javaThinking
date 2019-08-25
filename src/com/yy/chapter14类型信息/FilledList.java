package com.yy.chapter14������Ϣ;

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
	//ע�⣬���������������ͬһ�������κ����Ͷ�����һ��Ĭ�ϵĹ��������޲ι�������������ͻ�õ�һ���쳣�����Ǳ������Ըó��򲻻����
//	 �κξ�����Ϣ��
	
}
