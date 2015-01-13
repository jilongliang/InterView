package com.ljl.org.test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *@DEMO:Interview
 *@Author:jilongliang
 *@Date:2013-3-20
 */
public class Test10 {
	/**
	 * 答 :我 们 可 以 用 正 则 表 达 式 来 定 义 复 杂 的 字 符 串 格 式
	 * ,(\d{17}[0-9a-zA-Z]|\d{14}[0-9a-zA-Z]) 可以用来判断是否为合法的 15 位或 18 位身份证号码. 因为
	 * 15 位和 18 位的身份证号码都是从 7 位到第 12 位 为身份证为日期类型.这样我 们可以设计出更精确的正则模式 ,使身份证号的日期合法
	 * ,这样我们的正则模式 可以进一步将日期部分的正则修改为 [12][0-9]{3}[01][0-9][123][0-9] ,当然
	 * 可以更精确的设置日期.在 jdk 的 java.util.Regex 包中有实现正则的类 ,Pattern 和 Matcher . 以下是实
	 * 现代码：
	 */
	public static void main(String[] args) {
		// 测试是否为合法的身份证号码
		String[] strs = { "130681198712092019", "13068119871209201x",
				"13068119871209201", "123456789012345", "12345678901234x",
				"1234567890123" };
		Pattern p1 = Pattern.compile("(\\d{17}[0-9a-zA-Z]|\\d{14}[0-9a-zA-Z])");
		for (int i = 0; i < strs.length; i++) {
			Matcher matcher = p1.matcher(strs[i]);
			System.out.println(strs[i] + ":" + matcher.matches());
		}
		Pattern p2 = Pattern.compile("\\d{6}(\\d{8}).*"); // 用于提取出生日字符串
		Pattern p3 = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");// 用于将生日
		// 字符串进行分解为年月日
		for (int i = 0; i < strs.length; i++) {
			Matcher matcher = p2.matcher(strs[i]);
			boolean b = matcher.find();
			if (b) {
				String s = matcher.group(1);
				Matcher matcher2 = p3.matcher(s);
				if (matcher2.find()) {
					System.out.println(" 生日为 " + matcher2.group(1) + " 年 "
							+ matcher2.group(2) + " 月 " + matcher2.group(3)
							+ " 日 ");
				}
			}
		}
	}
}
