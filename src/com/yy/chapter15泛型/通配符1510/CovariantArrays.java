package com.yy.chapter15����.ͨ���1510;
/**
 *  ����ʾ��չʾ�����һ��������Ϊ�������򵼳����͵����鸳����������������
 * */

class  Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}
public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit =  new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        fruit[0] = new Fruit();
        fruit[0] = new Orange();
        System.out.println();
    }
    /**
     * main�����д�����һ��Apple���飬����ֵ��һ��Fruit�����������������ģ���ΪAppleҲ��һ��Fruit��
     * �������ʵ��������Apple���飬��ô��ֻ�ܴ�Apple����Apple�������͡��ڱ���ʱ�d��������������ʱ�����ˡ�
     * ���͵���Ҫ�����ǰ����ִ��������뵽�����ڼ䣬���潫�÷��������������顣
     * */
}
