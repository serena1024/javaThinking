package com.yy.chapter14类型信息;
/***
 *  14.5 instanceof与Class的等价性
 * **/
class Base{}
class Derived extends Base{}
public class FamilyVsExactType {
	static void test(Object x) {
		System.out.println("Testing x of type " + x.getClass());
		System.out.println(" x instanceof Base " + (x instanceof Base));
		System.out.println(" x instanceof Derived " + (x instanceof Derived));
		System.out.println(" Base.isInstance(x) " + Base.class.isInstance(x));
		System.out.println(" Derived.isInstance(x) " + Derived.class.isInstance(x));
		System.out.println(" x.getClass() == Base.class" + (x.getClass() == Base.class));
		System.out.println(" x.getClass().equals(Base.class)" + (x.getClass().equals(Base.class)));
		System.out.println(" x.getClass().equals(Derived.class)" + (x.getClass().equals(Derived.class)));
	}
	public static void main(String[] args) {
		test(new Base());
		System.out.println("==========================================");
		test(new Derived());
	}
	/***
	 * test()使用了两种形式的instanceof作为参数来执行类型检查，然后获取Class引用，并用==和equals来检查Class对象是否相等
	 * **/
}	
