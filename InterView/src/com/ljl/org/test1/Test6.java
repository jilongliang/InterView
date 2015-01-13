package com.ljl.org.test1;

import java.util.Scanner;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test6.java
 */
public class Test6 {
	/**
	 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数.在循环中
	 * 只要除数不等于0,用较大数除以较小的数,将小的一个数作为下一轮循
	 * 环的大数,取得的余数作为下一轮循环的较小的数 如此循环直到较小的
	 * 数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数
	 * 之积除以最大公约数.
	 */
	public static void main(String[] args) {
		int a, b, m;
		Scanner s = new Scanner(System.in);
		System.out.print("键入一个整数： ");
		a = s.nextInt();
		System.out.print("再键入一个整数： ");
		b = s.nextInt();
		deff cd = new deff();
		m = cd.deff(a, b);
		int n = a * b / m;
		System.out.println("最大公约数: " + m);
		System.out.println("最小公倍数: " + n);
	}
}
class deff {
	public int deff(int x, int y) {
		int t;
		if (x < y) {
			t = x;
			x = y;
			y = t;
		}
		while (y != 0) {
			if (x == y)
				return x;
			else {
				int k = x % y;
				x = y;
				y = k;
			}
		}
		return x;
	}
}
