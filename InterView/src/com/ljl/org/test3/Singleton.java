package com.ljl.org.test3;
/***
 * 
 * @author liangjilong
 *http://cantellow.iteye.com/blog/838473
 */
public class Singleton {
	/**
	 * 一个构造方法
	 */
	public Singleton() {
	}
	/**
	 * 方法一 懒汉式--->>其实就是懒加载的单例模式.
	 */
	public static Singleton singleton = null;
	//在方法函數上面寫synchronized效率比代码加synchronized块低
	//	public static synchronized Singleton getInstance() {
	//		if (singleton == null) {
	//				singleton = new Singleton();
	//			}
	//		return singleton;
	//	}
	public static  Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				singleton = new Singleton();
			}
		}
		return singleton;
	}

	/**
	 * 方法二 饿汉式
	 */
	public static Singleton sing = new Singleton();
	synchronized public static Singleton getInstan() {
		return sing;
	}
}
