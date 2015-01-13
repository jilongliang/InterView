package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test49.java
 *@Description:
 */
import java.util.Scanner;
public class Test49 {
	/**
	 *题目：计算字符串中子串出现的次数   
	 */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String str1 = s.nextLine();
		System.out.print("请输入子串：");
		String str2 = s.nextLine();
		int count = 0;
		if (str1.equals("") || str2.equals("")) {
			System.out.println("你没有输入字符串或子串,无法比较!");
			System.exit(0);
		}else
		{
			for(int i=0;i<=str1.length()-str2.length();i++){
				if(str2.equals(str1.substring(i, str2.length()+i)))
				//这种比法有问题，会把"aaa"看成有2个"aa"子串。       
				count++; 
			} System.out.println("子串在字符串中出现: "+count+" 次"); 
		}
	}
}