package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test40.java
 * @Description:
 */
public class Test40 {
	/**
	 * 题目：字符串排序.   
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 5;
		String temp = null;
		String[] s = new String[N];
		s[0] = "matter";
		s[1] = "state";
		s[2] = "solid";
		s[3] = "liquid";
		s[4] = "gas";
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (compare(s[i], s[j]) == false) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(s[i]);
		}
	}
	static boolean compare(String s1, String s2) {
		boolean result = true;
		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			if (s1.charAt(i) > s2.charAt(i)) {
				result = false;
				break;
			} else if (s1.charAt(i) < s2.charAt(i)) {
				result = true;
				break;
			} else {
				if (s1.length() < s2.length()) {
					result = true;
				} else {
					result = false;
				}
			}
		}
		return result;
	}
}