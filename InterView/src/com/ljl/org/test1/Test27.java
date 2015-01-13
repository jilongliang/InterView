package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test27.java
 * @Description:
 */
public class Test27 {
	/**
	 * 题目：求100之内的素数   //使用除sqrt(n)的方法求出的素数不包括2和3
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b = false;
		System.out.print(2 + " ");
		System.out.print(3 + " ");
		for (int i = 3; i < 100; i += 2) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			if (b == true) {
				System.out.print(i + " ");
			}
		}
	}
}