package com.ljl.org.test3;

public class QiuHedJieCheng {
	/**
	 * 计算1!+2!+...10!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long result = 0;
		long f = 1;
		for (int i = 1; i <= 10; i++) {
			f *= i; // f*等价于i*f
			/*
			 * result+=f;的意思是在当每循环一次就在之前的基础上加上f 等价于f + result
			 */
			result = f + result;
		}
		System.out.println("result=" + result);
	}
}
