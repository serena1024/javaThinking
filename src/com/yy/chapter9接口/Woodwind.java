package com.yy.chapter9½Ó¿Ú;

public class Woodwind extends Wind{
	
	@Override
	public void play(String n) {
		System.out.println("Woodwind.play"  + n);
	}
	public String what() {
		return "Woodwind";
	}
	@Override
	public void adjust() {}

		
}
