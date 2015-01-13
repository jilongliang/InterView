package com.ljl.org.test2;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:TestInteger.java
 * @Description:
 */
public class TestInteger {
	/**
	 * Integer是使用
	 * result:126,127,130
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = 130;
		Integer b = new Integer(127);
		Integer c = 126;
		for (int i = 125; i < 135; i++) {
			if (c == i) {
				System.out.println(126);
			}
			if (b == i) {
				System.out.println(127);
			}
			if (a == i) {
				System.out.println(130);
			}
		}
		
		/**
		 * 你说c会输出啥值呢？
		 */
		Integer a1=new Integer(131),b1=new Integer(131),c1=0; c1=a1==b1?1:0;
		Integer a2 =131,b2=131,c2=a2==b2?1:0;
		System.out.println(c1);
		System.out.println(c2);
	}
}
