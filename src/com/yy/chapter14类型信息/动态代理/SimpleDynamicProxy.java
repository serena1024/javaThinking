package com.yy.chapter14类型信息.动态代理;
/*****
 * 
 *动态代理示例
 *
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("******* proxy : " + proxy.getClass() + "  .method  " + method + "  .args  " + args);
		if(args != null) {
			for(Object arg : args) {
					System.out.println("###" + arg);
			}
		}
		return method.invoke(proxied, args);
	}
	
}
public class SimpleDynamicProxy {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[] {Interface.class}
				, new DynamicProxyHandler(real));
		consumer(proxy);
		/***
		 * 通过调用静态方法Proxy.newProxyInstance()可以创建动态代理，这个方法需要得到一个类加载器，一个你希望可以代理实现的接口列表，
		 * 以及InvocationHandler接口的一个实现。动态代理可以将所有调用重定向到调用处理器，因此通常会向调用处理器的构造器传递一个实际
		 * 的对象引用，从而使得调用处理器在执行其中介任务时，可以将请求转发。
		 * 
		 * 如果A是B的动态代理类，那么执行B的方法时，其实是执行的A的方法，
		 * 然后由A调用B，这样A就可以写一些其他逻辑，然后再调用B方法。比如加日志等。
		 * **/
	}
}
