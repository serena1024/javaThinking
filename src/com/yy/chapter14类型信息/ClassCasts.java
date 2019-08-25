package com.yy.chapter14类型信息;

class Building{}
class House extends Building{}
public class ClassCasts {
	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		House h  = houseType.cast(b);
		h = (House)b;
	}
}
