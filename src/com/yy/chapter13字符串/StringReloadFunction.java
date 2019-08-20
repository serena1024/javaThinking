package com.yy.chapter13字符串;
/****
 * String 上的操作
 * */
public class StringReloadFunction {
	public static void main(String[] args) {
		String a = "asdf1234555";
		System.out.println("length() ======== 字符串长度" + a.length());
		System.out.println("charAt() ======== 位置所在字符" + a.charAt(0));
		byte[] aa = a.getBytes();
		System.out.println("getBytes()====" + aa );
		char[] a1 = a.toCharArray();
		System.out.println("equalsIgnoreCase()忽略大小写" + "AAA".equalsIgnoreCase("aaa"));
		System.out.println("contains ====包含" + a.contains("*"));
		System.out.println("contentEquals 完全相等 ====" + a.contentEquals("cc"));
		System.out.println("regionMatches 根据两个字符串的索引偏移量比较 两个字符串是否相等 ====" + a.regionMatches(0,"qwet",0, 4));
		System.out.println("startsWith==== 是否已该字符串开始" + a.startsWith("a"));
		
	}
}
