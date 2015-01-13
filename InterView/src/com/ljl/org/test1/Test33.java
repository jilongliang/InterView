package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test33.java
 * @Description:
 */
public class Test33 {
	/**
	 * 题目：打印出杨辉三角形（要求打印出10行如下图）               
	 *   	   1            
	 * 	     1    1         
	 *     1    2    1    
	 *    1    3    3    1     
	 *   1    4    6    4    1  
	 * 1    5    10    10    5    1  
	 *.............................
	 */
	public static void main(String[] args) {
		int[][] a = new int[10][10];
		for (int i = 0; i < 10; i++) {
			a[i][i] = 1;
			a[i][0] = 1;
		}
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 2 * (10 - i) - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}