package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test24.java
 *@Description:
 */
import java.util.*;
public class Test24 {
	/**
	 * 题目：给一个不多于5位的正整数，
	 * 要求：一、求它是几位数，
	 * 二、逆序打印出各位数字. 
	 * 使用了长整型最多输入18位
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		long a = s.nextLong();
		String ss = Long.toString(a);
		char[] ch = ss.toCharArray();
		int j = ch.length;
		System.out.println(a + "是一个" + j + "位数。");
		System.out.print("按逆序输出是：");
		for (int i = j - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}