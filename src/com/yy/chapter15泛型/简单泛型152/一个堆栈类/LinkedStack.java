package com.yy.chapter15泛型.简单泛型152.一个堆栈类;
/**
 * 
 * 不使用linkedLIst来实现内部链式存储机制
 * */
public class LinkedStack<T>{
	private static class Node<U>{
		U item;
		Node<U> next;
		Node(){
			item = null; 
			next = null;
		}
		Node(U item,Node<U> next){
			this.item = item; 
			this.next = next;
		}
		boolean end() {
			return item == null && next == null;
		}
	}
	private Node<T> top = new Node<T>();
	public void push(T item) {
		top = new Node<T>(item,top);
	}
	public T pop() {
		T result = top.item;
		if(!top.end()) {
			top = top.next;
		}
		return result;
	}
	public static void main(String[] args) {
		LinkedStack<String> lss = new LinkedStack<String>();
		for(String s : "Phasers or stun!".split(" ") ) {
			lss.push(s);
		}
		String s ;
		while((s = lss.pop()) != null) {
			System.out.println(s);
		}
	}
	/**
	 * 内部类Node也是一个泛型，它拥有自己的类型参数
	 * */
}
