package com.yy.chapter11���ж���;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 * �����ͨ������ListIterator()����һ��ָ��List��ʼ����ListIterator �����һ�����ͨ������ListIterator��n����������
һ��һ��ʼ��ָ���б�����Ϊn��Ԫ�ش��� 	ListIterator��
 * 
 * **/
public class ListIteration {
	public static void main(String[] args) {
		List<Pet> pList = new ArrayList<Pet>();
		Pet p1 =new Pet();
		Pet p2 =new Pet();
		Pet p3 =new Pet();
		p1.setName("Angle");
		p2.setName("boll");
		p3.setName("candy");
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		ListIterator<Pet> li = pList.listIterator();
		while(li.hasNext()) {
			System.out.println("Name" + li.next().getName() + "nextIndex" + li.nextIndex() + "previousIndex"
					 + li.previousIndex());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous().getName());
		}
		while(li.hasNext()) {
			li.next();
			li.set(p3);
		}
		System.out.println(pList.toString());
	}
}
