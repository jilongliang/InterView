package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test12.java
 *@Description:
 */
import java.util.*;
public class Test12 {
	/**
	 * 题目：企业发放的奖金根据利润提成.利润(I)低于或等于10万元时,奖金可提10%；
	 * 利润高于10万元,低于20万元时,低于10万元的部分按10%提成,高于10万元的部分,
	 * 可可提成7.5%；20万到40万之间时,高于20万元的部分,可提成5%；40万到60万之
	 * 间时高于40万元的部分,可提成3%；60万到100万之间时,高于60万元的部分,可提
	 * 成1.5%,高于100万元时,超过100万元的部分按1%提成,从键盘输入当月利润,求应
	 * 发放奖金总数？   
	 */
	public static void main(String[] args) {
		double x = 0, y = 0;
		System.out.print("输入当月利润（万）：");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		if (x > 0 && x <= 10) {
			y = x * 0.1;
		} else if (x > 10 && x <= 20) {
			y = 10 * 0.1 + (x - 10) * 0.075;
		} else if (x > 20 && x <= 40) {
			y = 10 * 0.1 + 10 * 0.075 + (x - 20) * 0.05;
		} else if (x > 40 && x <= 60) {
			y = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (x - 40) * 0.03;
		} else if (x > 60 && x <= 100) {
			y = 20 * 0.175 + 20 * 0.05 + 20 * 0.03 + (x - 60) * 0.015;
		} else if (x > 100) {
			y = 20 * 0.175 + 40 * 0.08 + 40 * 0.015 + (x - 100) * 0.01;
		}
		System.out.println("应该提取的奖金是 " + y + "万");
	}
}