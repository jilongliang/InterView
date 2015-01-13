package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test37.java
 *@Description:
 */
import java.util.Scanner;
public class Test37 {
	/**
	 * 题目：有n个人围成一圈，顺序排号.从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位.   
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入排成一圈的人数：");
		int n = s.nextInt();
		boolean[] arr = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		int leftCount = n;
		int countNum = 0;
		int index = 0;
		while (leftCount > 1) {
			if (arr[index] == true) {
				countNum++;
				if (countNum == 3) {
					countNum = 0;
					arr[index] = false;
					leftCount--;
				}
			}
			index++;
			if (index == n) {
				index = 0;
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == true) {
				System.out.println("原排在第" + (i + 1) + "位的人留下了。");
			}
		}
	}
}