package com.ljl.org.sf;

import java.math.BigDecimal;

/**
 * 递归Recursive阶乘..
 * @author liangjilong
 */
public class DiGui {
	public static void main(String[] args) {
		//System.out.println("Result:" + jiecheng1(10));
		System.out.println("Result:" + jiecheng(1000000000));
		//bigDecimal(5,1);//x代表求5的階乘,1是一個返回值
		int ret = fac(-5);
		//System.out.println("ret = " + ret);
	}

	/** 1+....+1/n!的总和 */
	public static double jiecheng1(double sum) {
		if (sum == 1) {
			return 1;
		} else {
			return jiecheng1(sum - 1) + 1 / sum;
		}
	}

	/**
	 * 一个静态的方法 n!的阶乘
	 */
	public static int jiecheng(int x) {
		if(x<0){
			return 0;
		}
		else if (x == 0) {
			return 1;
		} else {
			return x * jiecheng(x - 1);
		}
	}
	/**
	 * 求5!=5*4*3*2*1;的的阶乘
	 * @param a
	 * @return
	 */
	public static int fac(int a) {
		if (a < 0) {
			return Thread.MAX_PRIORITY;
		}
		if (a == 0) {
			return 1;
		} else {
			return (a * fac(a - 1));
		}
	}
	/**
	 * 面試不建議使用
	 * @param x
	 * @param y
	 */
	public static void bigDecimal(int x,int y){
		BigDecimal result = new BigDecimal(y);
		for (int i = 1; i <= x; i++) {
			BigDecimal i_value = new BigDecimal(i);
			result = result.multiply(i_value);
		}
		System.out.println("result=" + result);
	}
}
