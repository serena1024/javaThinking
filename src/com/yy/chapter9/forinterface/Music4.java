package com.yy.chapter9.forinterface;

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
			new Brass(),
		};
		tuneAll(oo);
		}
}
