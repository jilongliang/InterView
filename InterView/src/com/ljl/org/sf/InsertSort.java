package com.ljl.org.sf;

/**
 * @Author:jilongliang
 * @Date :2013-4-22
 * @Project:Interview
 * @Class:InsertSort.java
 * @Description:插入排序
 * http://blog.chenlb.com/2008/12/insert-sort-for-java.html
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] sort = { 4, 6, 3, 9, 5 };
		Sort(sort);
		for (int i = 0; i < sort.length; i++)
			System.out.print(sort[i] + " ");
	}

	public static void Sort(int[] sort) {
		int i; // 为扫描次数
		int j; // 定为比较得元素
		for (i = 1; i < sort.length; i++) { // 扫描次数为sort.length-1
			int temp; // temp用来暂存数据
			temp = sort[i];
			j = i - 1;
			while (j >= 0 && temp < sort[j]) { // 如果第二个元素小于第一个元素
				sort[j + 1] = sort[j]; // 把所有的元素往后推一个位置
				j--;
			}
			sort[j + 1] = temp; // 最小的元素放到第一个位置
		}
	}
	
	
}
