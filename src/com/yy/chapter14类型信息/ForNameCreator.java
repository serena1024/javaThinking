package com.yy.chapter14������Ϣ;

import java.util.ArrayList;
import java.util.List;

import com.yy.chapter14������Ϣ.Pet;

public class ForNameCreator extends PetCreater{
	
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	public static String[] typeNames = {
			"com.yy.chapter14������Ϣ.Mutt",
			"com.yy.chapter14������Ϣ.Pug",
			"com.yy.chapter14������Ϣ.EgyptianMau",
			"com.yy.chapter14������Ϣ.Manx",
			"com.yy.chapter14������Ϣ.Crymric",
			"com.yy.chapter14������Ϣ.Rat",
			"com.yy.chapter14������Ϣ.Mouse",
			"com.yy.chapter14������Ϣ.Hamster"};
	
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
