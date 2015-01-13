package com.ljl.org.sf;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Rand {
	/**
	 * 请你写一个程序生成9个不重复的随机数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random(System.nanoTime());
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() < 9) {
			set.add(rand.nextInt(100));
		}
		System.out.println(set);
	}
}
