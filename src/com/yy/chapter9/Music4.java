package com.yy.chapter9;

public class Music4 {
	static void tune(Instrument i) {
		i.play("yunyun");
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument[] oo = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		tuneAll(oo);
		}
}
