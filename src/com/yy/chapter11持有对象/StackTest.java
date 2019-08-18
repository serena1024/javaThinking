package com.yy.chapter11持有对象;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for(String s : "My dog has fleas".split(" ")) {
			stack.push(s);
		}
		while(!stack.empty()) {
			System.out.print(stack.pop() + "\t");
		}
	}
}
