package com.yy.chapter13�ַ���;
/****
 * String �ϵĲ���
 * */
public class StringReloadFunction {
	public static void main(String[] args) {
		String a = "asdf1234555";
		System.out.println("length() ======== �ַ�������" + a.length());
		System.out.println("charAt() ======== λ�������ַ�" + a.charAt(0));
		byte[] aa = a.getBytes();
		System.out.println("getBytes()====" + aa );
		char[] a1 = a.toCharArray();
		System.out.println("equalsIgnoreCase()���Դ�Сд" + "AAA".equalsIgnoreCase("aaa"));
		System.out.println("contains ====����" + a.contains("*"));
		System.out.println("contentEquals ��ȫ��� ====" + a.contentEquals("cc"));
		System.out.println("regionMatches ���������ַ���������ƫ�����Ƚ� �����ַ����Ƿ���� ====" + a.regionMatches(0,"qwet",0, 4));
		System.out.println("startsWith==== �Ƿ��Ѹ��ַ�����ʼ" + a.startsWith("a"));
		
	}
}
