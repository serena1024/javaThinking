package com.yy.chapter9接口;
/***
 * 
 * @author HP
 * 乐器抽象类
 */
abstract class Instrument {
	private int i ;
	public abstract void play(String n);
	public String what() {
		return "Instrument";
	}
	public abstract void adjust();
	
}
