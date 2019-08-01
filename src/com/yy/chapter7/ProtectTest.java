package com.yy.chapter7;
/***
 * 
 * @author HP
 *protected 关键字，子类可以调用父类的 protected方法
 */
public class ProtectTest extends Villain {
	private int orcNumber;
	public ProtectTest(String name,int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}
	public void change(String name,int orcNumber) {
		set(name);//可以调用，因为是protected
		this.orcNumber = orcNumber;
	}
	public String toString() {
		return "orc " + orcNumber + ":" + super.toString();
	}
	public static void main(String[] args) {
		ProtectTest orc = new ProtectTest("Libuger", 12);
		System.out.println(orc);
		orc.change("BOb", 2);
		System.out.println(orc);
	}
}
class Villain{
	private String name;
	protected void set (String nm) {
		name = nm;
	}
	public Villain(String name) {
		this.name = name;
	}
	public String toString() {
		return "i am a Villain my name is " + name;
	}

	
}
