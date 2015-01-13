package com.ljl.org.test3;

public class StrTest {
	/**
	 *看下面的打印有什么效果
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "123";
		String b = "123";
		String e = "321";
		String c = "d";
		System.out.println(a.equals(b));
		System.out.println(a == b);
		System.out.println(c + b);
		System.out.println(e == b);
		System.out.println(e.equals(b));
	}
}
