package com.ljl.org.test2;

import java.util.Stack;

/**
 *@DEMO:Interview
 *@Author:jilongliang
 *@Date:2013-3-20
 */
public class Test4 {
	public static void main(String[] args) {
		//构造栈对象，使用类型限制，只能存储Integer数据
		Stack<Integer> s = new Stack<Integer>();
		
		//1、2、3依次入栈
		s.push(1);
		s.push(2);
		s.push(3);
		
		//3、2、1依次出栈
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
