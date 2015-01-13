package com.ljl.org.test3;

import java.io.UnsupportedEncodingException;

public class Gbk {
	public static void main(String[] args) {
		/**
		 * //我们在web应用开发过程中经常遇到输出某种编码的字符，如iso8859-1等，如何输出一个某种编码的字符串？
		 */
		String str = "zijie";
		try {
			str = new String(str.getBytes("ISO-8859-1"), "GBK");
			str = new String(str.getBytes("UTF-8"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(str);
	}
}
