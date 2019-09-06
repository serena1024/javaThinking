package com.yy.chapter14������Ϣ.��̬����;
/*****
 * 
 *��̬����ʾ��
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
		 * ͨ�����þ�̬����Proxy.newProxyInstance()���Դ�����̬�������������Ҫ�õ�һ�����������һ����ϣ�����Դ���ʵ�ֵĽӿ��б�
		 * �Լ�InvocationHandler�ӿڵ�һ��ʵ�֡���̬������Խ����е����ض��򵽵��ô����������ͨ��������ô������Ĺ���������һ��ʵ��
		 * �Ķ������ã��Ӷ�ʹ�õ��ô�������ִ�����н�����ʱ�����Խ�����ת����
		 * 
		 * ���A��B�Ķ�̬�����࣬��ôִ��B�ķ���ʱ����ʵ��ִ�е�A�ķ�����
		 * Ȼ����A����B������A�Ϳ���дһЩ�����߼���Ȼ���ٵ���B�������������־�ȡ�
		 * **/
	}
}
