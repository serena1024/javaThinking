package com.yy.chapter9.forinterface;

public class Percussion implements Instrument{
	
	@Override
	public void play(String n) {
		System.out.println("Percussion" + "play"  + n);
	}
	public String what() {
		return "Percussion";
	}
	@Override
	public void adjust() {
		System.out.println(this + "adjust");
	}

		
}
