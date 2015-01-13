package com.ljl.org.sf;

/**
 * @Author:jilongliang
 * @Date :2013-4-22
 * @Project:Interview
 * @Class:ShellSort.java
 * @Description:希尔排序
 */
public class ShellSort {
	public static int count = 0;

	public static void main(String[] args) {
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print(data);
		shellSort(data);
		print(data);
	}

	public static void shellSort(int[] data) {
		// 计算出最大的h值
		int h = 1;
		while (h <= data.length / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h; i < data.length; i += h) {
				if (data[i] < data[i - h]) {
					int tmp = data[i];
					int j = i - h;
					while (j >= 0 && data[j] > tmp) {
						data[j + h] = data[j];
						j -= h;
					}
					data[j + h] = tmp;
					print(data);
				}
			}
			// 计算出下一个h值
			h = (h - 1) / 3;
		}
	}

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}

}