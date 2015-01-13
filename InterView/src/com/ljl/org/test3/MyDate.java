package com.ljl.org.test3;

import java.text.SimpleDateFormat;
import java.util.Date;
public class MyDate {
	public static void main(String[] args) {
		beforeTomDate();
		yyyy_MM_dd();
	}

	/**
	 * 请你写一个程序打印出昨天的当前时间..
	 */
	private static void beforeTomDate() {
		String str = "";
		// 创建一个时间格式对象
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 创建一个时间对象
		Date d = new Date();
		// 设置一个时间值并且取到当前时间再减一天
		d.setDate(d.getDate() - 1);
		str = sd.format(d);
		System.out.println("打印出昨天的当前时间:" + str);
	}
	/**
	 * yyyy年mm月dd日
	 */
	private static void yyyy_MM_dd() {
		String str = "";
		// 创建一个时间格式对象
		SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日");
		// 创建一个时间对象
		Date d = new Date();
		// 设置一个时间值并且取到当前时间再减一天
		str = sd.format(d);
		System.out.println("yyyy年mm月dd日:" + str);
	}
}
