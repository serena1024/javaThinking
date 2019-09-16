package com.yy.chapter15����.ͨ���1510;

public class Holder<T> {
    private T value;
    public Holder(){}
    public Holder(T val){
        value = val;
    }
    public T get(){
        return value;
    }
    public void set(T val){
        value = val;
    }
    public boolean equals(Object obj){
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<Apple>(new Apple());
        Apple d = apple.get();
        apple.set(d);
        //�˴�����������ת��
       // Holder<Fruit> fruit1 = apple;
        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.get();
        d = (Apple)fruit.get();
        //Orange c = (Orange)fruit.get(); //����ʱ���������������Ǳ���Java.lang.ClassCastException Apple cannot be cast to Orange
        //fruit.set(new Apple()); ���ܽ���setֵ
        System.out.println(fruit.equals(d));

    }
}
