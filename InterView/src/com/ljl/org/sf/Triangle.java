package com.ljl.org.sf;

public class Triangle {
	public static void main(String[] args) {
		Positive_Graphics();// 正三角行
		Inverted_Graphics();// 倒三角行
	}

	/**
	 * 打印倒的三角型 请你写一个程序打印出一个，并且第一行是9个星星,第二行是7个, 依次这样打印到最后一行是1个星星
	 */
	public static void Inverted_Graphics() {
		System.out.println("======================运行效果======================");
		System.out.println("");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++)
				System.out.print(" ");
			for (int k = 1; k <= 11 - (2 * i); k++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

	/**
	 * 请你写一个程序打印出一个，并且第一行是一个星星,第二行是3个,依次这样打印到最后 一行是9个星星
	 */
	public static void Positive_Graphics() {
		System.out.println("打印出正的三角型的效果");
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
