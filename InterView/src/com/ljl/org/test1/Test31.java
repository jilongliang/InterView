package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test31.java
 *@Description:
 */
import java.util.*;
public class Test31 {
	/**
	 * 题目：将一个数组逆序输出.   
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[20];
		System.out.println("请输入多个正整数（输入-1表示结束）：");
		int i = 0, j;
		do {
			a[i] = s.nextInt();
			i++;
		} while (a[i - 1] != -1);
		System.out.println("你输入的数组为：");
		for (j = 0; j < i - 1; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("\n数组逆序输出为：");
		for (j = i - 2; j >= 0; j = j - 1) {
			System.out.print(a[j] + " ");
		}
	}
}