package com.ljl.org.test2;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 *@DEMO:Interview
 *@Author:jilongliang
 *@Date:2013-3-20
 */
public class Stack5 {
	public static void main(String[] args) {
		// 构造栈对象，使用类型限制，只能存储Integer数据
		MyStack<Integer> s = new MyStack<Integer>();
		// 1、2、3依次入栈
		s.push(1);
		s.push(2);
		s.push(3);
		// 3、2、1依次出栈
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}

/**
 * 栈类
 * 
 * @author developer_05
 * @param <T>
 */
class MyStack<T> extends Vector<T> {
	/**
	 * 构造方法
	 */
	public MyStack() {
	}

	/**
	 * 入栈方法
	 * 
	 * @param item
	 *            待入栈的元素
	 * @return 返回入栈的元素
	 */
	public T push(T item) {
		addElement(item);
		return item;
	}

	/**
	 * 出栈方法(同步处理)
	 * 
	 * @return 返回出栈元素
	 */
	public synchronized T pop() {
		T obj;
		int len = size();
		if (len == 0)
			throw new EmptyStackException();
		obj = elementAt(len - 1);
		removeElementAt(len - 1);
		return obj;
	}

	/**
	 * 判断栈是否为空的方法
	 * 
	 * @return 返回true(栈空)或false(栈非空)
	 */
	public boolean empty() {
		return size() == 0;
	}

	private static final long serialVersionUID = 1L;
}