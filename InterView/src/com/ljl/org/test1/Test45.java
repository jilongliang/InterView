package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test45.java
 *@Description:
 */
import java.util.*;
public class Test45 {
	/**
	 * 题目：判断一个素数能被几个9整除 
	 * 题目错了吧?能被9整除的就不是素数了!所以改成整数了.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = s.nextInt();
		int tmp = num;
		int count = 0;
		for (int i = 0; tmp % 9 == 0;) {
			tmp = tmp / 9;
			count++;
		}
		System.out.println(num + " 能够被 " + count + " 个9整除。");
	}
}