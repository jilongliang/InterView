package com.ljl.org.test2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) throws Exception {

		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("请输入一个数组,中间用空格隔开");
		String str = buf.readLine();
		@SuppressWarnings("unused")
		Set<Integer> set = new TreeSet<Integer>();

		System.out.println("(" + str.replaceAll("\\D+", " ") + ")");

		String st[] = str.replaceAll("\\D+", " ").trim().split(" +");

		for (String s : st) {
			System.out.println(s + "、");
			// set.add(Integer.parseInt(s));
		}
		/*
		 * System.out.println(" ---排序运行的结果---"); Iterator<Integer> iter =
		 * set.iterator(); while (iter.hasNext()) {
		 * System.out.println(iter.next() + "、"); }
		 */
	}
}
