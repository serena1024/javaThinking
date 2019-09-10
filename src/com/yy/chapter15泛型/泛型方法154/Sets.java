package com.yy.chapter15泛型.泛型方法154;
/**
 * 用Set和泛型实现数学表达式
 * **/

import java.util.HashSet;
import java.util.Set;

public class Sets {
	//实现的数学上的并集
	public static <T> Set<T> union(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	//实现的数学上的交集
	public static <T> Set<T> intersaction(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	//实现差集，出去相同的部分
	public static <T> Set<T> difference(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.removeAll(b);
		return result;
	}
	//实现数学上交集之外的元素
	public static <T> Set<T> complement(Set<T> a, Set<T> b){
		return difference(union(a,b),intersaction(a,b));
	}
}
