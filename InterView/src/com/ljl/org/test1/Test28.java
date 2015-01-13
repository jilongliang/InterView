package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test28.java
 *@Description:
 */
import java.util.*;
public class Test28 {
	/**
	 * 题目：对10个数进行排序   
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("请输入10个整数：");
		for (int i = 0; i < 10; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
