package com.ljl.org.test3;

public class FenShuJcHe {
	/**
	 * 请你求: e=1+1/1+1/2!+1/3!+… …的近似值
	 */
	public static void main(String[] args) {
		double sum = 0, item = 1;
		int i = 1;
		while (i <= 1000) {
			sum = sum + item;
			i++;
			item = item * (1.0 / i);
		}
		sum = sum + 1;
		System.out.println("e=" + sum);
		System.out.println("-----------------");
		sum = 0;
		i = 1;
		item = 1;
		do {
			sum = sum + item;
			i++;
			item = item * (1.0 / i);
		} while (i <= 1000);
		sum = sum + 1;
		System.out.println("e=" + sum);
	}
}
