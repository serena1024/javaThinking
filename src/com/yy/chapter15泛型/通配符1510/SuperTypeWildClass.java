package com.yy.chapter15泛型.通配符1510;

import java.util.List;

/**
 *超类通配符示例
 * **/
public class SuperTypeWildClass {
    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new Jonathan());
       // apples.add(new Fruit());编译不通过，报错
        /**
         *Apple是某种基类的List，这样向其中添加Apple或者Apple的子类型是安全的；
         * 但是由于Apple是下界，所以不能添加Fruit、
         * 1*/
    }
}
