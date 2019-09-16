package com.yy.chapter15泛型.通配符1510;

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
        //此处报错不能向上转型
       // Holder<Fruit> fruit1 = apple;
        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.get();
        d = (Apple)fruit.get();
        //Orange c = (Orange)fruit.get(); //编译时不报错，但是运行是报错Java.lang.ClassCastException Apple cannot be cast to Orange
        //fruit.set(new Apple()); 不能进行set值
        System.out.println(fruit.equals(d));

    }
}
