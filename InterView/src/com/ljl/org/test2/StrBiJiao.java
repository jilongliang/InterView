package com.ljl.org.test2;

public class StrBiJiao {
	/**
	 * 请你证明一下两个字符串的大小
	 * @author 梁继龙
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "b";
		System.out.println("===================初步测试=============================");
		
		System.out.println("Result:" + str1.compareTo(str2));
		System.out.println("Result:" + str2.compareTo(str1));
		
		if (str1.compareTo(str2) > str2.compareTo(str1)) {
			System.out.println("结果\t"+"st1>str2");
		}
		if (str2.compareTo(str1) > str1.compareTo(str2)) {
			System.out.println("结果\t"+"st1<str2");
		}
		

		

		
		if (str1 == str2) {
			System.out.println("两者相等");
		}
		if (str1.equals(str2)) {
			System.out.println("两者相等");
		}
		// ----1-0-1-----
		
		System.out.println("================================================");
		String a1 = "abcd";
		String a2 = "abcd";
		

		if (a1 == a2) {
			System.out.println("a1=a2");
		}

		if (a1.equals(a2)) {
			System.out.println("a1=a2");
		}

		System.out
				.println("==============new=String=================================");

		String a3 = new String("abcd");
		String a4 = new String("abcd");

		if (a3 == a4) {
			System.out.println("a3=a4");
		}

		if (a3.equals(a4)) {

			System.out.println("a3=a4");
		}
		System.out.println("================================================");

		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");

		if (sb1.equals(sb2)) {
			System.out.println("sb1==sb2");
		}
		if (sb1 == sb2) {
			System.out.println("sb1==sb2");
		}
	}
}
