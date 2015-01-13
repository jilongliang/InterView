package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test38.java
 *@Description:
 */
import java.util.*;
public class Test38 {
	/**
	 * 题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度.
	 * 题目意思似乎不能用length()函数    
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = s.nextLine();
		System.out.println("字符串的长度是：" + str.length());
	}
}