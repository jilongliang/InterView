package com.ljl.org.test2;

/**
 *@DEMO:Interview
 *@Author:jilongliang
 *@Date:2013-3-20
 */
public class Test9 {
	/**
	 * 下面有一个字符串如：abcbc,如何替换成afff输出, 不能用String,replace替换也不用replaceAll("bc","ff");
	 * 用了replace和replaceAll都不给分,也无效
	 */
	public static void main(String[] args) {
		System.out.println(replace("abcbc", "bc", "ff"));// 只能用这种
		System.out.println(replace1("abcbc", "bc", "ff"));// 只能用这种

		String Str = "abcbc";
		Str = Str.replace("bc", "ff");
		Str = Str.replaceAll("bc", "ff");
		System.out.println(Str);

	}

	public static String replace(String param, String old, String _new) {
		String value = "";
		int repLen = old.length();
		int val;
		while ((val = param.indexOf(old)) != -1) {
			value += param.substring(0, val);
			value += _new;
			param = param.substring(val + repLen);
		}
		value += param;
		return value;
	}

	public static String replace1(String param, String old, String _new) {
		//StringBuilder ss = new StringBuilder();
		StringBuffer sb = new StringBuffer(param);
		int index = 0;
		while ((index = sb.indexOf(old, index)) != -1) {
			sb.delete(index, index + old.length());
			sb.insert(index, _new);
			index += _new.length();
		}
		return sb.toString();
	}
}
