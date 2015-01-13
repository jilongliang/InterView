package com.ljl.org.test3;

/**
 * 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1.写出程序.
 * 
 * 以下程序使用内部类实现线程，对j增减的时候没有考虑顺序问题
 */

public class ThreadTest1 {
	private int j;

	public static void main(String args[]) {
		ThreadTest1 tt = new ThreadTest1();
		Inc inc = tt.new Inc();//在内部类要tt.new
		Dec dec = tt.new Dec();
		Thread t =null;
		for (int i = 0; i < 3; i++) {
			 t=new Thread(inc);
			t.start();
			t = new Thread(dec);
			t.start();
		}
	}

	/**
	 * J++
	 */
	private synchronized void inc() {
		j++;
		System.out.println(Thread.currentThread().getName() + "inc:" + j);
	}

	/**
	 * J--
	 */
	private synchronized void dec() {
		j--;
		System.out.println(Thread.currentThread().getName() + "dec:" + j);
	}

	/**
	 * 
	 *Inc 实现Runnable
	 */
	class Inc implements Runnable {
		public void run() {
			for (int i = 0; i <3; i++) {
				inc();
			}
		}
	}
	/**
	 * Dec实现Runnable
	 * 
	 */
	class Dec implements Runnable {
		public void run() {
			for (int i = 0; i < 3; i++) {
				dec();
			}
		}
	}
}
