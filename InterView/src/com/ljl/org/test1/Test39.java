package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test39.java
 *@Description:
 */
import java.util.*;

public class Test39 {
	/**
	 * 题目：编写一个函数，输入n为偶数时，
	 * 调用函数求1/2+1/4+...+1/n,当输入n为奇数时，
	 * 调用函数1/1+1/3+...+1/n(利用指针函数)   //没有利用指针函数
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个正整数 n= ");
		int n = s.nextInt();
		System.out.println("相应数列的和为：" + sum(n));
	}
	public static double sum(int n) {
		double res = 0;
		if (n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				res += (double) 1 / i;
			}
		} else {
			for (int i = 1; i <= n; i += 2) {
				res += (double) 1 / i;
			}
		}
		return res;
	}
}