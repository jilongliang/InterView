package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test8.java
 *@Description:
 */
import java.util.*;
public class Test8 {
	/**
	 * 题目：求s=a+aa+aaa+aaaa+aa...a的值,其中a是一个数字.
	 * 例如2+22+222+2222+22222(此时共有5个数相加),几个数相加有键盘控制. 
	 * @param args
	 */
	public static void main(String[] args) {
		long a, b = 0, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("输入数字a的值： ");
		a = s.nextInt();
		System.out.print("输入相加的项数：");
		int n = s.nextInt();
		int i = 0;
		while (i < n) {
			b = b + a;
			sum = sum + b;
			a = a * 10;
			++i;
		}
		System.out.println(sum);
	}
}