package com.yy.chapter9;
/***
 * 
 * @author HP
 * ����������
 */
abstract class Instrument {
	private int i ;
	public abstract void play(String n);
	public String what() {
		return "Instrument";
	}
	public abstract void adjust();
	
}
