package com.yy.chapter14������Ϣ;

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