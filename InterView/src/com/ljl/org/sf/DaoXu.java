package com.ljl.org.sf;

public class DaoXu {
	/**
	 * 【问题】请用一个算法程序把“我爱您”倒序输出“你爱我”
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("-------------方法一-------------");
		str1("你爱我");
		System.out.println("-------------方法二-------------");
		System.out.println(str2("你爱我"));
		System.out.println("-------------方法三-------------");
		System.out.println(str3("你爱我"));
		System.out.println("-------------方法四-------------");
		System.out.println(str4("你爱我"));
		System.out.println("----------方法五----------------");
		str5("你爱我");
	}

	/**
	 * charAt
	 */
	public static void str1(String s) {
		String str = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		System.out.println(str);
	}

	/**
	 * charAt
	 */
	public static String str2(String s) {
		String str = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		return str;
	}

	/**
	 * StringBuffer append
	 */
	public static String str3(String s) {
		StringBuffer sb = new StringBuffer("");
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	/**
	 * substring(beginIndex,endIndex) beginIndex是提取开始位置,而且是从0开始, endIndex是提取结束位置
	 * Java是基于字符串的字符首字为1出来
	 */
	public static String str4(String st) {
		String str = "";
		int s, a;
		for (int i = 0; i < st.length(); i++) {
			s = st.length() - i - 1;
			a = st.length() - i;
			str = str + st.substring(s, a);
		}
		return str;
	}

	/**
	 * 面试最好不要用.
	 * 
	 * @param str
	 */
	public static void str5(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
	}
}
