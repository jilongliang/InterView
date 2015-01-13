package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test10.java
 * @Description:
 */
public class Test10 {
	/**
	 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半;再落下
	 * 求它在第10次落地时,共经过多少米?第10次反弹多高?
	 */
	public static void main(String[] args) {
		double h = 100, s = 100;
		for (int i = 1; i < 10; i++) {
			s = s + h;
			h = h / 2;
		}
		System.out.println("经过路程：" + s);
		System.out.println("反弹高度：" + h / 2);
	}
}
