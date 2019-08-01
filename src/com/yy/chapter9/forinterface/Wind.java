package com.yy.chapter9.forinterface;

public class Wind implements Instrument{
	
	@Override
	public void play(String n) {
		System.out.println("Wind" + "play"  + n);
	}
	public String what() {
		return "Wind";
	}
	@Override
	public void adjust() {
		System.out.println(this + "adjust");
	}

		
}
