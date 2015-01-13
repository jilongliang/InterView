package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test14.java
 *@Description:
 */
import java.util.*;
public class Test14 {
	/**
	 * 题目：输入某年某月某日，判断这一天是这一年的第几天？   
	 * @param args
	 */
	public static void main(String[] args) {
		int year, month, day;
		int days = 0;
		int d = 0;
		int e;
		Input fymd = new Input();
		do {
			e = 0;
			System.out.print("输入年：");
			year = fymd._input();
			System.out.print("输入月：");
			month = fymd._input();
			System.out.print("输入天：");
			day = fymd._input();
			if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
				System.out.println("输入错误，请重新输入！");
				e = 1;
			}
		} while (e == 1);
		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			}
			d += days;
		}
		System.out.println(year + "-" + month + "-" + day + "是这年的第" + (d + day)
				+ "天。");
	}
}
class Input {
	public int _input() {
		int value = 0;
		Scanner s = new Scanner(System.in);
		value = s.nextInt();
		return value;
	}
}