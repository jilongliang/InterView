package com.ljl.org.test3;

public class JieziJie {
	/**
	 * 编写一个截取字符串的函数,输入为一个字符串和字节数, 输出为按字节截取的字符串,但要保证汉字不被截取半个,
	 * 如"我ABC",4,应该截取"我AB",输入"我ABC汉DEF",6, 应该输出"我ABC",而不是"我ABC+汉的半个"。
	 */
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unused")
		String str = "我a爱中华abc我爱传智def";
		String str1 = "我ABC汉";
		int num = trimGBK(str1.getBytes("GBK"), 5);
		System.out.println(str1.substring(0, num));
	}

	public static int trimGBK(byte[] buf, int n) {
		int num = 0;
		boolean bChineseFirstHalf = false;
		for (int i = 0; i < n; i++) {
			if (buf[i] < 0 && !bChineseFirstHalf) {
				bChineseFirstHalf = true;
			} else {
				num++;
				bChineseFirstHalf = false;
			}
		}
		return num;
	}
}
