package com.ljl.org.sf;

/**
 * @Author:jilongliang
 * @Date :2013-4-22
 * @Project:Interview
 * @Class:Selection.java
 * @Description:选择排序
 * 
 * 原理：每次都找到当次最大的数，按大小顺序依次放入数组相应位置
 * 
 * 比如：第一次先找到最大的数并记下其位置，如果其不在数组第一位，
 * 
 * 则将其与第一位交换，使最大数置于第一位
 * 
 * 第二次再循环查找第二大的数并记下其位置，如果其不在数组第二位，
 * 
 * 则将其与第二位交换，使最大数置于第二位
 * 
 * 依次类推.........................................
 * 
 * 第i次再循环查找第i大的数并记下其位置，如果其不在数组第 i位，
 * 
 * 则将其与第 i位交换，使最大数置于第 i位
 */
@SuppressWarnings("all")
public class SelectionSort {
	/**
	 * 第一种
	 */
	public static  void sort(){
		int[] a = { 25, 15, 42, 16, 12, 36 };
		int max = 0;
		int tmp = 0;
		for (int i = 0; i < a.length; i++) {
			max = i;//
			/** 查找第 i大的数，直到记下第 i大数的位置 ***/
			for (int j = i + 1; j < a.length; j++) {
				if (a[max] < a[j])
					max = j;// 记下较大数位置，再次比较，直到最大
			}
			/*** 如果第 i大数的位置不在 i,则交换 ****/
			if (i != max) {
				tmp = a[i];
				a[i] = a[max];
				a[max] = tmp;
			}
		}
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	
	}
	/**
	 *  第二种
	 * @param data
	 */
	public static void comparableSort(Comparable[] data) {
		int intLength = data.length;
		for (int i = 0; i < intLength - 1; i++) {
			int minIndex = i;
			// Find smallest name
			for (int j = i + 1; j < intLength; j++) {
				Comparable a = data[j];
				Comparable b = data[minIndex];
				if (a.compareTo(b) < 0) {
					minIndex = j;
				}
			}
			// Swap data if necessary
			if (minIndex != i) {
				Comparable temp = data[i];
				data[i] = data[minIndex];
				data[minIndex] = temp;
			}
		}
	}

	public static void main(String[] args) {
		Comparable[] c = { 4, 9, 23, 1, 45, 27, 5, 2 };
		comparableSort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println("选择排序：" + c[i]);
		}
	}
}
