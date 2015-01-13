package com.ljl.org.sf;

/**
 * @Author:jilongliang
 * @Date :2013-4-22
 * @Project:Interview
 * @Class:HeapSort.java
 * @Description:堆排序
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] a = { 26, 5, 77, 1, 61, 11, 59, 15, 48, 19 };
		Sort(a);
	}
	public static void Sort(int[] a) {
		int n = a.length;
		int temp = 0;
		Display(a, "Before sort : ");
		for (int i = n / 2; i > 0; i--)
			Adjust(a, i - 1, n);
		for (int i = n - 2; i >= 0; i--) {
			temp = a[i + 1];
			a[i + 1] = a[0];
			a[0] = temp;
			Adjust(a, 0, i + 1);
		}
		Display(a, "After  sort : ");
	}
	public static void Adjust(int[] a, int i, int n) {
		int j = 0;
		int temp = 0;
		temp = a[i];
		j = 2 * i + 1;
		while (j <= n - 1) {
			if (j < n - 1 && a[j] < a[j + 1])
				j++;
			if (temp >= a[j])
				break;
			a[(j - 1) / 2] = a[j];
			j = 2 * j + 1;
		}
		a[(j - 1) / 2] = temp;
	}
	public static void Display(int[] a, String str) {
		System.out.println(str);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
