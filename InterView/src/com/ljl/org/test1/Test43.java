package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test43.java
 * @Description:
 */
public class Test43 {
	/**
	 * 题目：求0—7所能组成的奇数个数.   
	 *组成1位数是4个.
	 *组成2位数是7*4个.
	 *组成3位数是7*8*4个.
	 *组成4位数是7*8*8*4个.
	 *......
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 4;
		int j;
		System.out.println("组成1位数是 " + sum + " 个");
		sum = sum * 7;
		System.out.println("组成2位数是 " + sum + " 个");
		for (j = 3; j <= 9; j++) {
			sum = sum * 8;
			System.out.println("组成" + j + "位数是 " + sum + " 个");
		}
	}
}