package com.yy.chapter15����.ͨ���1510;

import java.util.List;

/**
 *����ͨ���ʾ��
 * **/
public class SuperTypeWildClass {
    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new Jonathan());
       // apples.add(new Fruit());���벻ͨ��������
        /**
         *Apple��ĳ�ֻ����List���������������Apple����Apple���������ǰ�ȫ�ģ�
         * ��������Apple���½磬���Բ������Fruit��
         * 1*/
    }
}
