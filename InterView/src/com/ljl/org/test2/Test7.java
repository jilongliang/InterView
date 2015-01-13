package com.ljl.org.test2;
/**
 *@DEMO:Interview
 *@Author:jilongliang
 *@Date:2013-3-20
 */
public class Test7 {
	public static void main(String[] args) {
		/**
		 * 数组有没有length()这个方法? String有没有length()这个方法？
		 */
		String [] list={"广东","阳春","阳江"};
		String str="广东省阳江市阳春县";
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]);
		}
		System.out.println("字符串的长度"+str.length());
		
	}
}
