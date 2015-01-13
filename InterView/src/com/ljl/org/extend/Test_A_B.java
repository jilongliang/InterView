package com.ljl.org.extend;
/**
 *@Date:2013-3-20
 *@DEMO:Interview
 *@Date:2015-1-13下午11:15:49
 *@Author:liangjilong
 *@Email:jilongliang@sina.com
 *@Weibo:http://weibo.com/jilongliang
 *@Version:1.0
 *@Description：
 */

public class Test_A_B {
	/**
	 * 
	 *【问题】 ClassA,ClassB同时都是类,在考虑代码的重复性,ClassB继承ClassA去实现你会怎么去编写代码?
	 * 或者这样编写代码合理吗？如果合理请用代码以程序形式写出来
	 * @param args
	 */
	public static void main(String[] args) {
		A b = new B();
		b.show();
	}
}
