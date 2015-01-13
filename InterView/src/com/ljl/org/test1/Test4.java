package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test1.java
 * @Description:
 */

/**
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
import java.util.Scanner;

public class Test4 {
	/**
	 * 【程序4】   
	 * 题目：将一个正整数分解质因数
	 * 例如：输入90,打印出90=2*3*3*5程序分析：对n进行分解质因数，应先找到一个最小的质数k
	 * 然后按下述步骤完成：   
	 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可
	 * (2)如果n <> k，但n能被k整除,则应打印出k的值并用n除以k的商,作为新的正整数你n,重复执行第一步
	 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请键入一个正整数:     ");
		int n = s.nextInt();
		int k = 2;
		System.out.print(n + "=");
		while (k <= n) {
			if (k == n) {
				System.out.println(n);
				break;
			} else if (n % k == 0) {
				System.out.print(k + "*");
				n = n / k;
			} else
				k++;
		}
	}
}
