package com.yy.chapter14类型信息.反射;
/***
 * 反射
 * ***/

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;


public class ShowMethods {
	private static String usage = "usage: \n" + "ShowMenthods qualified.class.name: \n" 
				+ "to show all methods in class or :\n" + "ShowMenthods qualified.class.name word: \n"  
				+ "To search for methods involving word";
	private static Pattern p = Pattern.compile("\\w+\\.");
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println(usage);
			System.exit(0);
		}
		int line = 0;
		try {
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args.length == 1) {
				for(Method method : methods) {
					System.out.println(p.matcher(method.toString().replaceAll(" ","")));
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
