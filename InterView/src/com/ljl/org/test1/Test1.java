package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test1.java
 *@Description:
 */
/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子小兔子 长到
 * 第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ 
 * 这是一个菲波拉契数列问题
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("第1个月的兔子对数:    1");
		System.out.println("第2个月的兔子对数:    1");
		int f1 = 1, f2 = 1, f, M = 24;
		for (int i = 3; i <= M; i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("第" + i + "个月的兔子对数: " + f2);
		}
	}
}