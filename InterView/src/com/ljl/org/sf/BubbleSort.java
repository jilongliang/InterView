package com.ljl.org.sf;

public class BubbleSort {

	/**
	 * 冒(冒泡)择(选择) 路(插入) 兮(希尔) 快(快速) 归(归并) 堆(堆排序)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i[] = { 3, 3232323, 4232 };
		Str(i);
		for (int k : i) {
			System.out.println(k);
		}
	}

	public static void Str(int s[]) {
		int temp;
		for (int i = 0; i < s.length; i++) {
			for (int j = i; j < s.length; j++) {
				if (s[i] > s[j]) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
	}
}
