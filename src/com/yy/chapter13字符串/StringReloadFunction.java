package com.yy.chapter13�ַ���;
/****
 * String �ϵĲ���
 * */
public class StringReloadFunction {
	public static void main(String[] args) {
		String a = "asdf1234555";
		String b = "bbbb";
		String c = "       dddd     ddd    ";
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
		System.out.println("endsWith==== �Ƿ��Ѹ��ַ�������" + a.endsWith("5"));
		System.out.println("indexOf==== �ַ�����λ��" + a.indexOf("6"));
		System.out.println("lastIndexOf==== �ַ�����λ�ã��Ӻ���ǰ��" + a.lastIndexOf("5"));
		System.out.println("substring==== �����±��ȡ�ַ����������µ��ַ���" + a.substring(0, 1));
		System.out.println("concat==== ���������ַ����������µ��ַ���" + a.concat(b));
		System.out.println("replace==== ��ָ���ַ��滻Ϊ�������ַ����������µ��ַ���" + b.replace(b, c));
		System.out.println("toLowerCase==== ���ַ���Сд" + a.toLowerCase());
		System.out.println("toUpperCase==== ���ַ�����д" + a.toUpperCase());
		System.out.println("trim==== ȥ�����˿ո�" + c.trim());
		System.out.println("valueOf==== ���ر�ʾ�������ݵ�String" + String.valueOf(c) );
		System.out.println("intern==== Ϊÿ��Ψһ���ַ���������һ���ҽ�����һ��String����" + a.intern() );
		
	}
}
