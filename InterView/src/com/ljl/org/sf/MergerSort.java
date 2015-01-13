package com.ljl.org.sf;

/**
 * @Author:jilongliang
 * @Date :2013-4-22
 * @Project:Interview
 * @Class:MergerSort.java
 * @Description:归并排序
 */
public class MergerSort {
	// 归并排序算法
	public void mergeSort(int[] list, int length) {
		int[] temp = new int[length];// 临时数组
		recMergeSort(list, temp, 0, length - 1);
	}

	// 递归分割数据到基本单位
	private void recMergeSort(int[] list, int[] temp, int low, int upper) {
		if (low == upper) {
			return;
		} else {
			int mid = (low + upper) / 2;
			recMergeSort(list, temp, low, mid);
			recMergeSort(list, temp, mid + 1, upper);
			merge(list, temp, low, mid + 1, upper);
		}
	}

	// 归并操作将基本单位归并成整个有序的数组
	private void merge(int[] list, int[] temp, int left, int right, int last) {
		int j = 0;
		int lowIndex = left;
		int mid = right - 1;
		int n = last - lowIndex + 1;
		while (left <= mid && right <= last) {
			if (list[left] < list[right]) {
				temp[j++] = list[left++];
			} else {
				temp[j++] = list[right++];
			}
		}
		while (left <= mid) {
			temp[j++] = list[left++];
		}
		while (right <= last) {
			temp[j++] = list[right++];
		}
		for (j = 0; j < n; j++) {
			list[lowIndex + j] = temp[j];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 568, 34, 46, 9, 23, 89, 43, 572, 684, 783, 543 };
		MergerSort merger = new MergerSort();
		merger.mergeSort(arr, 12);
		for (int i = 0; i < 12; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}