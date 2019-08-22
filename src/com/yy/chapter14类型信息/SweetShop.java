package com.yy.chapter14������Ϣ;
class Gum{
	static {
		System.out.println("Loading Gum");
	}
}
class Candy{
	static {
		System.out.println("Loading Candy");
	}
}
class Cookie{
	static {
		System.out.println("Loading Cookie");
	}
}
public class SweetShop {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating candy");
		try {
			Class.forName("com.yy.chapter14������Ϣ.Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("could not find gum");
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
		
	}
}
