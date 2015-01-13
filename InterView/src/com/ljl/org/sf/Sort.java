package com.ljl.org.sf;

/**
 * @Author:jilongliang
 * @Date :2013-4-22
 * @Project:Interview
 * @Class:Sort.java
 * @Description:冒(冒泡)择(选择) 路(插入) 兮(希尔) 快(快速) 归(归并) 堆(堆排序)
 */
public class Sort {
	// 待排数组
	private static int[] input = new int[] { 2, 1, 5, 4, 9, 8, 6, 7, 10, 3 };
	private static long swapcount = 0;
	private static long loopcount = 0;

	/**
	 * 获取随机整数数组
	 * 
	 * @param arrayLength
	 * @param maxNum
	 * @return
	 */
	private static int[] getRandomArray(int arrayLength, int maxNum) {
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * maxNum);
		}
		return array;
	}

	/**
	 * 打印数组
	 */
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + 1 + ":" + array[i]);
		}
	}

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}

	private static void printArray() {
		for (int i : input) {
			System.out.print(i + " ");
		}
	}

	/**
	 * 交换数值
	 * 
	 * @param array
	 * @param i
	 * @param j
	 */
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void resetCount() {
		swapcount = 0;
		loopcount = 0;
	}

	/**
	 * 插入排序
	 * 
	 * @param array
	 * @return
	 */
	private static int[] insertSort(int[] array) {
		// 与前边排序好的子序列比较，向前依次比较相邻元素，将元素推到正确位置
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
				swap(array, j, j - 1);
				loopcount++;
				swapcount++;
			}
		}
		return array;
	}

	/**
	 * 冒泡排序
	 * 
	 * @param array
	 * @return
	 */
	private static int[] bubbleSort(int[] array) {
		// 从头开始向后依次比较相邻元素，将最大值推到数组尾部
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
					swapcount++;
				}
				loopcount++;
			}
		}
		return array;
	}

	/**
	 * 选择排序
	 * 
	 * @param array
	 * @return
	 */
	private static int[] selectionSort(int[] array) {
		// 每次循环找出相对最小值，并交换到头部
		for (int i = 0; i < array.length - 1; i++) {
			int lowIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[lowIndex])
					lowIndex = j;
				loopcount++;
			}
			swap(array, lowIndex, i);
			swapcount++;
		}
		return array;
	}

	/**
	 * 希尔排序
	 * @param data
	 */
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

	/**
	 * 快速排序 伪代码： QUICKSORT(A, p, r) 1 if p < r 2 then q ← PARTITION(A, p, r) 3
	 * QUICKSORT(A, p, q - 1) 4 QUICKSORT(A, q + 1, r)
	 * 
	 * PARTITION(A, p, r) 1 x ← A[r] 2 i ← p - 1 3 for j ← p to r - 1 4 do if
	 * A[j] ≤ x 5 then i ← i + 1 6 exchange A[i] ↔ A[j] 7 exchange A[i + 1] ↔
	 * A[r] 8 return i + 1 复杂度，最坏情况下：Θ(n^2) 一般平衡情况：Θ(nlgn)
	 * 
	 * @param array
	 *            待排数组
	 * @param from
	 *            起始位置
	 * @param to
	 *            终止位置
	 */
	private static void quickSort(int[] array, int from, int to) {
		if (from < to) {
			int temp = array[to];
			int i = from - 1;
			for (int j = from; j < to; j++) {
				if (array[j] <= temp) {
					i++;
					int tempValue = array[j];
					array[j] = array[i];
					array[i] = tempValue;
				}
			}
			array[to] = array[i + 1];
			array[i + 1] = temp;
			quickSort(array, from, i);
			quickSort(array, i + 1, to);
		}
	}

	/**
	 *  归并排序算法=====================================
	 * @param list
	 * @param length
	 */
	public static void mergeSort(int[] list, int length) {
		int[] temp = new int[length];// 临时数组
		recMergeSort(list, temp, 0, length - 1);
	}

	/**
	 * 递归分割数据到基本单位
	 * @param list
	 * @param temp
	 * @param low
	 * @param upper
	 */
	private static void recMergeSort(int[] list, int[] temp, int low, int upper) {
		if (low == upper) {
			return;
		} else {
			int mid = (low + upper) / 2;
			recMergeSort(list, temp, low, mid);
			recMergeSort(list, temp, mid + 1, upper);
			merge(list, temp, low, mid + 1, upper);
		}
	}

	/**
	 * 归并操作将基本单位归并成整个有序的数组
	 * @param list
	 * @param temp
	 * @param left
	 * @param right
	 * @param last
	 */
	private static void merge(int[] list, int[] temp, int left, int right, int last) {
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

	/**
	 *  堆排序=================================
	 * @param a
	 */
	public static void HeapSort(int[] a) {
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
	//堆排序=================================
	
	public static void main(String[] args) {
		int[] array = Sort.getRandomArray(100, 1000);
		Sort.printArray(array);
		System.out.println("------------------------");
		System.out.println("以上为初始数组");
		System.out.println("------------------------");

		/**
		 * 插入排序
		 */
		int[] insertArray = array.clone();
		Sort.resetCount();
		Sort.insertSort(insertArray);
		Sort.printArray(insertArray);
		System.out.println("------------------------");
		System.out.println("insertSort交换次数为：" + swapcount);
		System.out.println("insertSort循环次数为：" + loopcount);
		System.out.println("------------------------");

		// 冒泡排序
		int[] bubbleArray = array.clone();
		Sort.resetCount();
		Sort.bubbleSort(bubbleArray);
		Sort.printArray(bubbleArray);
		System.out.println("------------------------");
		System.out.println("bubbleSort交换次数为：" + swapcount);
		System.out.println("bubbleSort循环次数为：" + loopcount);
		System.out.println("------------------------");

		/**
		 * 选择排序
		 */
		int[] selectionArray = array.clone();
		Sort.resetCount();
		Sort.selectionSort(selectionArray);
		Sort.printArray(selectionArray);
		System.out.println("------------------------");
		System.out.println("selectionSort交换次数为：" + swapcount);
		System.out.println("selectionSort循环次数为：" + loopcount);
		System.out.println("------------------------");

		/**
		 * 希尔排序
		 */
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print(data);
		shellSort(data);
		print(data);

		/**
		 * 快速排序
		 */
		quickSort(input, 0, input.length - 1);
		// 打印数组
		printArray();
		/**
		 * 归并排序
		 */
		int arr[] = { 2, 568, 34, 46, 9, 23, 89, 43, 572, 684, 783, 543 };
		mergeSort(arr, 12);
		for (int i = 0; i < 12; i++) {
			System.out.print(arr[i] + ",");
		}
		/**
		 * 堆排序
		 */
		int[] a = { 26, 5, 77, 1, 61, 11, 59, 15, 48, 19 };
		HeapSort(a);
	}
}
