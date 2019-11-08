package com.yy.interview;
/**
 *����ģʽʾ��
 * */
interface food{}

class A implements food{}
class B implements food{}
class C implements food{}

public class StaticFactory {
    private StaticFactory(){}
    public static food getA(){  return new A(); }
    public static food getB(){  return new B(); }
    public static food getC(){  return new C(); }
}
class Client{
    //�ͻ��˴���ֻ��Ҫ����Ӧ�Ĳ������뼴�ɵõ�����
    //�û�����Ҫ�˽⹤�����ڲ����߼���
    public void get(String name){
        food x = null ;
        if ( name.equals("A")) {
            x = StaticFactory.getA();
        }else if ( name.equals("B")){
            x = StaticFactory.getB();
        }else {
            x = StaticFactory.getC();
        }
    }
}