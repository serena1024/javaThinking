package com.yy.chapter14类型信息;

import java.util.Arrays;
import java.util.List;

public class Shapes{
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(),new Triangle(),new Square());
		for(Shape s : shapeList) {
			s.draw();
		}
	}
}