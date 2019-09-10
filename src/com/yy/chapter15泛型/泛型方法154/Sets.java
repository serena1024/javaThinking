package com.yy.chapter15����.���ͷ���154;
/**
 * ��Set�ͷ���ʵ����ѧ���ʽ
 * **/

import java.util.HashSet;
import java.util.Set;

public class Sets {
	//ʵ�ֵ���ѧ�ϵĲ���
	public static <T> Set<T> union(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	//ʵ�ֵ���ѧ�ϵĽ���
	public static <T> Set<T> intersaction(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	//ʵ�ֲ����ȥ��ͬ�Ĳ���
	public static <T> Set<T> difference(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.removeAll(b);
		return result;
	}
	//ʵ����ѧ�Ͻ���֮���Ԫ��
	public static <T> Set<T> complement(Set<T> a, Set<T> b){
		return difference(union(a,b),intersaction(a,b));
	}
}
