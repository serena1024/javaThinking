package com.yy.chapter14������Ϣ;

public class BoundedClassReferences {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = double.class;
		//�����κμ̳�Number�����඼�С�
		//��Class������ӷ����﷨��ԭ�������Ϊ���ṩ�����Եļ�飬����������������Ժ�ͻ�����������һ��
		
	}
}	
