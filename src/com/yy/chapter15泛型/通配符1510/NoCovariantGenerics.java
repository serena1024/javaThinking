package com.yy.chapter15泛型.通配符1510;

import java.util.ArrayList;
import java.util.List;

/**
 * 用泛型容器代替数组示例
 * **/
public class NoCovariantGenerics {
    //这里在编译时期就报错了：不能把一个涉及Apple的泛型赋值给一个涉及Fruit的泛型
    //List<Fruit> flist = new ArrayList<Apple>();
}
