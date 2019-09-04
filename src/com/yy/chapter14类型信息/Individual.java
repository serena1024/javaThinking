package com.yy.chapter14类型信息;
/****
 * Person 的父类
 * ***/
public class Individual {
	private String name ;

	public Individual() {
		super();
	}

	public Individual(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
}
