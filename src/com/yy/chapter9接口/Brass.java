package com.yy.chapter9�ӿ�;

public class Brass extends Wind{
	
	@Override
	public void play(String n) {
		System.out.println("Brass.play"  + n);
	}
	public String what() {
		return "Brass";
	}
	@Override
	public void adjust() {}

		
}
