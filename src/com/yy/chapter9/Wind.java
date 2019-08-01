package com.yy.chapter9;

public class Wind extends Instrument{
	
	@Override
	public void play(String n) {
		System.out.println("Wind.play"  + n);
	}
	public String what() {
		return "Wind";
	}
	@Override
	public void adjust() {}

		
}
