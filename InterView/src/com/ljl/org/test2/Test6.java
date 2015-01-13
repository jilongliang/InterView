package com.ljl.org.test2;

/**
 * @DEMO:Interview
 * @Author:jilongliang
 * @Date:2013-3-20
 */
public class Test6 {
	/**
	 * try {}里有一个return语句,那么紧跟在这个try后的finally {}里的
	 * code会不会被执行,什么时候被执行,在return前还是后?
	 * 
	 * @return
	 */
	public String Test1() {
		String str = "真的在";
		try {
			str = str + "return前输出？";
			return str;
		} finally {
			str = "finally在return前输出";
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Test6 t = new Test6();
		System.out.println(t.Test1());

		System.out.println(foo()); // 第二行输出0
	}

	private static int foo() {
		int i = 0;
		try {
			return i++;
		} finally {
			System.out.println(":"+(++i)); // 第一行输出2
		}
	}

}
