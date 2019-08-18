package com.yy.chapter9½Ó¿Ú;

public class Percussion extends Instrument{
	
	@Override
	public void play(String n) {
		System.out.println("Percussion.play"  + n);
	}
	public String what() {
		return "Percussion";
	}
	@Override
	public void adjust() {}

		
}
