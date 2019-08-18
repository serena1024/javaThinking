package com.yy.chapter9½Ó¿Ú;

public class Stringed extends Instrument{
	
	@Override
	public void play(String n) {
		System.out.println("Stringed.play"  + n);
	}
	public String what() {
		return "Stringed";
	}
	@Override
	public void adjust() {}

		
}
