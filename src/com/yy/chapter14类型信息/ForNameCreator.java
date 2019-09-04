package com.yy.chapter14类型信息;

import java.util.ArrayList;
import java.util.List;

import com.yy.chapter14类型信息.Pet;

public class ForNameCreator extends PetCreater{
	
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	public static String[] typeNames = {
			"com.yy.chapter14类型信息.Mutt",
			"com.yy.chapter14类型信息.Pug",
			"com.yy.chapter14类型信息.EgyptianMau",
			"com.yy.chapter14类型信息.Manx",
			"com.yy.chapter14类型信息.Crymric",
			"com.yy.chapter14类型信息.Rat",
			"com.yy.chapter14类型信息.Mouse",
			"com.yy.chapter14类型信息.Hamster"};
	
	private static void loader() {
		for(String name : typeNames) {
			try {
				types.add((Class<? extends Pet>)Class.forName(name));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	static { loader() ; }
			
	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}
}
