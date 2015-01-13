package com.ljl.org.test1;

import java.util.Scanner;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test48.java
 */
public class Test48 {
	/**
	 *题目：某个公司采用公用电话传递数据,数据是四位的整数,在传递过程中是加密的,加密规则如下.
	 *每位数字都加上5,然后用和除以10的余数代替该数字,再将第一位和第四 位交换,第二位和第三位交换.   
	 */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = 0, temp;
		do {
			System.out.print("请输入一个4位正整数：");
			num = s.nextInt();
		} while (num < 1000 || num > 9999);
		int a[] = new int[4];
		a[0] = num / 1000; // 取千位的数字
		a[1] = (num / 100) % 10; // 取百位的数字
		a[2] = (num / 10) % 10; // 取十位的数字
		a[3] = num % 10; // 取个位的数字
		for (int j = 0; j < 4; j++) {
			a[j] += 5;
			a[j] %= 10;
		}
		for (int j = 0; j <= 1; j++) {
			temp = a[j];
			a[j] = a[3 - j];
			a[3 - j] = temp;
		}
		System.out.print("加密后的数字为：");
		for (int j = 0; j < 4; j++)
			System.out.print(a[j]);
	}
}
