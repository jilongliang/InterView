package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test35.java
 *@Description:
 */
import java.util.*;
public class Test35 {
	/**
	 * 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组.   
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 8;
		int[] a = new int[N];
		Scanner s = new Scanner(System.in);
		int idx1 = 0, idx2 = 0;
		System.out.println("请输入8个整数：");
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("你输入的数组为：");
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + " ");
		}
		int max = a[0], min = a[0];
		for (int i = 0; i < N; i++) {
			if (a[i] > max) {
				max = a[i];
				idx1 = i;
			}
			if (a[i] < min) {
				min = a[i];
				idx2 = i;
			}
		}
		if (idx1 != 0) {
			int temp = a[0];
			a[0] = a[idx1];
			a[idx1] = temp;
		}
		if (idx2 != N - 1) {
			int temp = a[N - 1];
			a[N - 1] = a[idx2];
			a[idx2] = temp;
		}
		System.out.println("\n交换后的数组为：");
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + " ");
		}
	}
}