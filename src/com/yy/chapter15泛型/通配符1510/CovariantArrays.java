package com.yy.chapter15泛型.通配符1510;
/**
 *  以下示例展示数组的一种特殊行为：可以向导出类型的数组赋予基类型数组的引用
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
     * main方法中创建了一个Apple数组，并赋值给一个Fruit数组的引用是有意义的，因为Apple也是一种Fruit。
     * 但是如果实际类型是Apple数组，那么就只能存Apple或者Apple的子类型。在编译时郿报错，但是在运行时报错了。
     * 泛型的主要作用是把这种错误检测移入到编译期间，下面将用泛型容器代替数组。
     * */
}
