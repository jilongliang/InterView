package com.ljl.org.test1;

import java.util.Scanner;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test.java
 * @Description:
 */
public class Test5 {
	/**
	 * 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示.  
	 * @param args
	 */
	public static void main(String[] args) {
		int x;
		char grade;
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个成绩: ");
		x = s.nextInt();
		grade = x >= 90 ? 'A' : x >= 60 ? 'B' : 'C';
		System.out.println("等级为：" + grade);
	}
}
