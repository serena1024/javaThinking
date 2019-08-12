package com.yy.chapter11;

import java.io.Serializable;

public class Pet implements Comparable<Pet>{
	private int id;
	public Pet(String string) {
		this.name = string;
	}
	public Pet() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int compareTo(Pet o) {
		return 0;
	}
}
