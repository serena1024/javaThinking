package com.yy.chapter7������;
/****
 * 
 * @author HP
 *  ����ת�͡� �����ã��������������һ������
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