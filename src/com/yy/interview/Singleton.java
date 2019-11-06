package com.yy.interview;
/**
 *˫��У�鵥��ģʽ
 * */
public class Singleton { // 1
    private volatile static Singleton singleton;// 2
    private Singleton(){}
    public static Singleton getSingleton(){// 3
        if(singleton == null){// 4:��һ�μ��
            synchronized (Singleton.class){// 5:����
                if (singleton == null){// 6:�ڶ��μ��
                    singleton = new Singleton();// 7:����ĸ�Դ��������
                }// 8
            }
        }// 9
        return singleton;// 10
    }// 11
}

/***������singleton�������û����volatile�ؼ������εģ��ᵼ������һ�����⣺
        ���߳�ִ�е���4�е�ʱ�򣬴����ȡ��singleton��Ϊnullʱ��singleton���õĶ����п��ܻ�û����ɳ�ʼ����
        ��Ҫ��ԭ������������������ָ�������ʹ�����Ϊ���Ż��������ܶ���ָ�����н������������һ���ֶΡ�
        ��7�еĴ��봴����һ��������һ�д�����Էֽ��3��������

        memory = allocate();����// 1�����������ڴ�ռ�
        ctorInstance(memory);��// 2����ʼ������
        instance = memory;����// 3������instanceָ��շ�����ڴ��ַ
        ��Դ���ڴ����е�2��3֮�䣬���ܻᱻ���������磺

        memory = allocate();����// 1�����������ڴ�ռ�
        instance = memory;����// 3������instanceָ��շ�����ڴ��ַ
        // ע�⣬��ʱ����û�б���ʼ����
        ctorInstance(memory);��// 2����ʼ������
        ���ڵ��̻߳�������û������ģ����ڶ��̻߳����»�������⣺

        B�̻߳ῴ��һ����û�б���ʼ���Ķ���

        A2��A3��������Ӱ���߳�A�����ս�������ᵼ���߳�B��B1���жϳ�instance��Ϊ�գ��߳�B������������instance���õĶ��󡣴�ʱ���߳�B������ʵ�һ����δ
        ��ʼ���Ķ���
        ����ֻ��Ҫ��һ��С���޸ģ���instance����Ϊvolatile�ͣ����Ϳ���ʵ���̰߳�ȫ���ӳٳ�ʼ������Ϊ��volatile�ؼ������εı����Ǳ���ֹ������ġ�

        ���ڶ���������volatileдʱ�����ܵ�һ��������ʲô���������������������ȷ��volatileд֮ǰ�Ĳ������ᱻ������������volatileд֮��
        ����һ��������volatile��ʱ�����ܵڶ���������ʲô���������������������ȷ��volatile��֮��Ĳ������ᱻ������������volatile��֮ǰ��
        ����һ��������volatileд���ڶ���������volatile��ʱ������������*

 */