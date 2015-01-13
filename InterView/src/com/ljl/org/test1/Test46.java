package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test46.java
 *@Description:
 */
import java.util.Scanner;
public class Test46 {
	/**
	 * 题目：两个字符串连接程序   
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String str1 = s.nextLine();
		System.out.print("请再输入一个字符串：");
		String str2 = s.nextLine();
		String str = str1 + str2;
		System.out.println("连接后的字符串是" + str);
	}
}