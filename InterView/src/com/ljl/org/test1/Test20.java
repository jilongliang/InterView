package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test20.java
 * @Description:
 */
public class Test20 {
	/**
	 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和. 
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2, y = 1, t;
		double sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum = sum + (double) x / y;
			t = y;
			y = x;
			x = y + t;
		}
		System.out.println("前20项相加之和是： " + sum);
	}
}