package com.yy.chapter11持有对象;

import java.util.LinkedList;

/****
 * 栈的说明
 * */
public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v) {storage.addFirst(v);}
	public T peek(T v) { return storage.getFirst();}
	public T pop() { return storage.removeFirst();}
	public boolean empty() { return storage.isEmpty();}
	public String toString() {return storage.toString();}
}
