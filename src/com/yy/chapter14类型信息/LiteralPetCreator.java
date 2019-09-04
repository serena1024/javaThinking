package com.yy.chapter14类型信息;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreater{
	
	public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(
			Arrays.asList(Pet.class,Dog.class,Cat.class,Rodent.class,Mutt.class,Pug.class,EgyptianMau.class
					,Manx.class,Crymric.class,Rat.class,Mouse.class,Hamster.class));
	
	private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	
	public List<Class<? extends Pet>> types() {
		return types;
	}
	public static void main(String[] args) {
		System.out.println(types);
	}
}
