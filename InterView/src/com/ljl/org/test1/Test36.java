package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test36.java
 *@Description:
 */
import java.util.Scanner;
public class Test36 {
	/**
	 * 题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数   
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 10;
		int[] a = new int[N];
		Scanner s = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("你输入的数组为：");
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n请输入向后移动的位数：");
		int m = s.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = a[N - m + i];
		}
		for (int i = N - 1; i >= m; i--) {
			a[i] = a[i - m];
		}
		for (int i = 0; i < m; i++) {
			a[i] = b[i];
		}
		System.out.print("位移后的数组是：");
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + " ");
		}
	}
}