package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test21.java
 * @Description:
 */
public class Test22 {
	/**
	 * 题目：利用递归方法求5!.   
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 5;
		rec fr = new rec();
		System.out.println(n + "! = " + fr.rec(n));
	}
}

class rec {
	public long rec(int n) {
		long value = 0;
		if (n == 1) {
			value = 1;
		} else {
			value = n * rec(n - 1);
		}
		return value;
	}
}