package com.yy.interview;
/**
 *
 * ԭ��ģʽ���ǽ�һ��������Ϊԭ�ͣ�ʹ��clone()�����������µ�ʵ����
 * */
public class Prototype {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone()   {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }finally {
            return null;
        }
    }

    public static void main ( String[] args){
        Prototype pro = new Prototype();
        Prototype pro1 = (Prototype)pro.clone();
    }
}
