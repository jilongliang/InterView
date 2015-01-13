package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test16.java
 * @Description:
 */
public class Test16 {
	/**
	 * 题目：输出9*9口诀.  
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
				if (j * i < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}