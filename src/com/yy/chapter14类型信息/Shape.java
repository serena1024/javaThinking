package com.yy.chapter14������Ϣ;

import java.util.Arrays;

abstract class Shape {
	void draw() {
		System.out.println(this + ".draw()");
	}
}
class Circle extends Shape{
	public String toString() {
		return "Circle";
	}
}
class Square extends Shape{
	public String toString() {
		return "Square";
	}
}
class Triangle extends Shape{
	public String toString() {
		return "Triangle";
	}
}

