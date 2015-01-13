package com.ljl.org.test2;

import java.util.Arrays;
import java.util.Scanner;

public class SortPaixu {

	/**Arrays自带的sort排序方法
	 */
	public static void main(String[] args) {
		SortPaixu mp = new SortPaixu();
		mp.Method2();
	}

	public void Method1() {
		int[] score = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩:");
		for (int i = 0; i < score.length; i++) {
			score[i] = input.nextInt();
		}
		Arrays.sort(score);
		System.out.println("学员的成绩按的排序列表");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

	public void Method2() {
		int[] score = { 1, 21, 2 };
		Arrays.sort(score);
		System.out.println("学员的成绩按的排序列表");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
