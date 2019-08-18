package com.yy.chapter7复用类;
/****
 * 
 * @author HP
 *  向上转型。 可以用：新类是现有类的一种类型
 */
public class Wind extends Instrument{
	public static void main(String[] args) {
		Wind wind = new Wind();
		Instrument.tune(wind);
	}
}
class Instrument{
	public void play() {
		System.out.println("Playing```");
	}
	static void tune(Instrument i) {
		i.play();
	}
}