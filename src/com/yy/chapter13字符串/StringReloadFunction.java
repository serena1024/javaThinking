package com.yy.chapter13字符串;
/****
 * String 上的操作
 * */
public class StringReloadFunction {
	public static void main(String[] args) {
		String a = "asdf1234555";
		String b = "bbbb";
		String c = "       dddd     ddd    ";
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
		System.out.println("endsWith==== 是否已该字符串结束" + a.endsWith("5"));
		System.out.println("indexOf==== 字符所在位置" + a.indexOf("6"));
		System.out.println("lastIndexOf==== 字符所在位置，从后往前数" + a.lastIndexOf("5"));
		System.out.println("substring==== 根据下标截取字符串，返回新的字符串" + a.substring(0, 1));
		System.out.println("concat==== 连接两个字符串，返回新的字符串" + a.concat(b));
		System.out.println("replace==== 将指定字符替换为其他的字符，返回最新的字符串" + b.replace(b, c));
		System.out.println("toLowerCase==== 将字符串小写" + a.toLowerCase());
		System.out.println("toUpperCase==== 将字符串大写" + a.toUpperCase());
		System.out.println("trim==== 去除两端空格" + c.trim());
		System.out.println("valueOf==== 返回表示参数内容的String" + String.valueOf(c) );
		System.out.println("intern==== 为每个唯一的字符序列生成一个且仅生成一个String引用" + a.intern() );
		
	}
}
