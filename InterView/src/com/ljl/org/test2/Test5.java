package com.ljl.org.test2;
public class Test5 {
	/**
	 * 用最有效率的方法算出2乘以8等於几？顾名思义2乘以8等于16.但是程序要的不是这样的结果
	 * 1、2<<3表示把二进制的2左移3为，即2*2^3(2乘以2的三次方)=16；// 这种符合题意 
	 * 2、8<<1表示把二进制的8左移1为，即8*2=16；// 这种根本就不是题目的意思。
	 * 3、如果你硬要用8<<1的话，那为什么不用4<<2或者16<<0呢。 
	 * 4、根据题目意思当然是2<<3了。 
	 * 5、如果题目问：用最有效率的方法算出8乘以2等于几？那么就是：8<<1.
	 */
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int x = a << b;
		int y = a >> b;
		int z = a >>> b;
		System.out.println("result:" + x);// result:16
		System.out.println("result:" + y);// result:0
		System.out.println("result:" + z);// result:0
	}
}
