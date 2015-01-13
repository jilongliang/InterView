package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test15.java
 *@Description:
 */
import java.util.*;
public class Test15 {
	/**
	 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出.  
	 * @param args
	 */
	public static void main(String[] args) {
		MyInput fnc = new MyInput();
		int x = 0, y = 0, z = 0;
		System.out.print("输入第一个数字：");
		x = fnc._Input();
		System.out.print("输入第二个数字：");
		y = fnc._Input();
		System.out.print("输入第三个数字：");
		z = fnc._Input();
		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}
		if (x > z) {
			int t = x;
			x = z;
			z = t;
		}
		if (y > z) {
			int t = y;
			y = z;
			z = t;
		}
		System.out.println("三个数字由小到大排列为： " + x + " " + y + " " + z);
	}
}
class MyInput {
	public int _Input() {
		int value = 0;
		Scanner s = new Scanner(System.in);
		value = s.nextInt();
		return value;
	}
}
