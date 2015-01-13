package com.ljl.org.test3;

public class DoubleTest {
	/**
	 * 如何将a乘以b的结果,6.875000000000001改为 6.875
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 12.5;
		double b = 0.55;
		System.out.println(a * b);
		// .3f是 向后面的小数点取三位数printf在C++使用比较多
		System.out.printf("%.3f", a * b); 
	}
}
