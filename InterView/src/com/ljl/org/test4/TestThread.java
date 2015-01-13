package com.ljl.org.test4;

/**
 *@DEMO:Interview
 *@Author:jilongliang
 *@Date:2013-4-17
 */
public class TestThread {

	/**
	 * 设计两个线程类，一个线程类负责打印100以内所有的偶数，
	 * 另一个线程打印100以内所有的奇数。要求偶数线程
	 */
	public static void main(String[] args) {
		new Thread(new PrintNumThread(100, true)).start();
		new Thread(new PrintNumThread(200, false)).start();//101-200的偶數
	}
}

class PrintNumThread implements Runnable {

	private int max;

	private boolean isOdd;

	/**
	 * 构造器
	 * 
	 * @param max
	 *            最大数
	 * @param modNum
	 *            %
	 */
	public PrintNumThread(int max, boolean isOddFlag) {
		this.max = max;
		this.isOdd = isOddFlag;
	}

	@Override
	public void run() {
		/**奇数*/
		for (int i = 0; i <= max; i++) {
			if (isOdd && isOddOrEven(i)) {
				out("奇数" + i);
			}
		}
		/**偶数*/
		for (int i = 101; i <= max; i++) {
			if (!isOdd && !isOddOrEven(i)) {
				out("偶数" + i);
			}
		}
	}

	/**
	 * 是否为奇数
	 * odd奇数
	 * even偶数
	 * @param i数
	 * @return
	 */
	private boolean isOddOrEven(int i) {
		if (0 == i)
			return false;
		if (0 != (i % 2))
			return true;
		return false;
	}

	private void out(String string) {
		System.out.println(string);
	}
}
