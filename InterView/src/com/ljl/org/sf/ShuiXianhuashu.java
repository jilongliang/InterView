package com.ljl.org.sf;

public class ShuiXianhuashu {
	/**
	 * 【问题】求0到1000的水仙花数有哪些,请你用程序打印出来
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			int a = i / 100;
			int b = i / 10 % 10;
			int c = i % 10;
			if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i)
				System.out.println(i + "是水仙花数");
		}
	}
}
