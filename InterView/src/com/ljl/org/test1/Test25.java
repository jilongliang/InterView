package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test25.java
 *@Description:
 */
import java.util.*;
public class Test25 {
	/**
	 * 题目：一个5位数，判断它是不是回文数.即12321是回文数，个位与万位相同，十位与千位相同.   
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		do {
			System.out.print("请输入一个5位正整数：");
			a = s.nextInt();
		} while (a < 10000 || a > 99999);
		String ss = String.valueOf(a);
		char[] ch = ss.toCharArray();
		if (ch[0] == ch[4] && ch[1] == ch[3]) {
			System.out.println("这是一个回文数");
		} else {
			System.out.println("这不是一个回文数");
		}
	}
}
