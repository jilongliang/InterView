package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test44.java
 *@Description:
 */
import java.util.*;
public class Test44 {
	/**
	 * 题目：一个偶数总能表示为两个素数之和.由于用除sqrt(n)的方法求出的素数不包括2和3
	 * 因此在判断是否是素数程序中人为添加了一个3.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i;
		do {
			System.out.print("请输入一个大于等于6的偶数：");
			n = s.nextInt();
		} while (n < 6 || n % 2 != 0);// 判断输入是否是>=6偶数,不是,重新输入
		fun fc = new fun();
		for (i = 2; i <= n / 2; i++) {
			if ((fc.fun(i)) == 1 && (fc.fun(n - i) == 1)) {
				int j = n - i;
				System.out.println(n + " = " + i + " + " + j);
			} // 输出所有可能的素数对  
		}
	}
}

class fun {
	public int fun(int a)// 判断是否是素数的函数
	{
		int i, flag = 0;
		if (a == 3) {
			flag = 1;
			return (flag);
		}
		for (i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				flag = 0;
				break;
			} else
				flag = 1;
		}
		return (flag);
	}
	// 不是素数,返回0,是素数,返回1}}
}