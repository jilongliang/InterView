package com.ljl.org.test4;

import java.io.IOException;

/**
 * @Author:jilongliang
 * @Date :2013-4-21
 * @Project:Interview
 * @Class:GcTest.java
 * @Description:
 */
public class GcTest {
	/**
	 * JDK的解释：
	 *  1)gc(garbage collection) public void gc()运行垃圾回收器.调用此方法意味着 Java
	 * 虚拟机做了一些努力来回收未用对象，以便能够快速地重用这些对象当前占用的内存.当控制从方法调用中返回时，
	 * 虚拟机已经尽最大努力回收了所有丢弃的对象.名称 gc 代表“垃圾回收器”.虚拟机根据需要在单独的线程中自动执
	 * 行回收过程，甚至不用显式调用 gc 方法. 方法 System.gc();是调用此方法的一种传统而便捷的方式. 
	 * 
	 * 2)public static void gc()运行垃圾回收器. 调用 gc 方法暗示着 Java 虚拟机做了一些努力来回收未用对象
	 * 以便能够快速地重用这些对象当前占用的内存.当控制权从方法调用中返回时，虚拟机已经尽最大努力从所有丢弃的对象中回收了空间.
	 * 调用 System.gc() 实际上等效于调用: Runtime.getRuntime().gc()
	 * 
	 * 3)原理：将无用的对象空间进行释放， GC两种回收：自动回收，手工调用System.gc()；方法实际上是调用System.gc();就相当于调用
	 *  了Runtime.getRuntime().gc();方法
	 */
	public static void main(String[] args) {

		try {
			System.out.println("GC");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			Runtime rt = Runtime.getRuntime();
			rt.gc();// 手工回收
			/**
			 * 调用System.gc();其实就是调用Runtime.getRuntime().gc();回收 public static
			 * void gc() { Runtime.getRuntime().gc(); }
			 */
			System.gc();
			
			rt.totalMemory();//清除内存
			rt.freeMemory();//释放内存

		}
		/**
		 * Runtime与System的常用
		 */
		String name="C:/Windows/System32/crypt32.dll";
		// print when the program starts
		System.out.println("Program starting...");
		// load a library that is Windows/System32 folder
		System.out.println("Loading Library...");
		Runtime.getRuntime().load(name);
		System.out.println("Library Loaded.");
		
		//1.加载文件 
		System.load(name); 
		Runtime.getRuntime().load(name); 
		//2.加载库 
		System.loadLibrary(name); 
		Runtime.getRuntime().loadLibrary(name); 
		//3.快速复制数组 
		Object src=null,dest=null;
		int srcPos=0,destPos = 0,length=0;
		System.arraycopy(src, srcPos, dest, destPos, length);
		//4.取得系统的时间(毫秒数) 
		System.currentTimeMillis(); 
		//5.系统退出命令 
		System.exit(0); 
		Runtime.getRuntime().exit(0); 
		//6.垃圾回收 
		System.gc(); 
		Runtime.getRuntime().gc(); 
		//7.查看系统内存 
		Runtime.getRuntime().totalMemory(); 
		Runtime.getRuntime().maxMemory(); 
		Runtime.getRuntime().freeMemory(); 
		//8.运行系统程序 
		//如打开记事本 
		try {
			Runtime.getRuntime().exec("notepad") ;
			Runtime.getRuntime().exec("notepad").waitFor();//等待进程结束 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//9.使用关闭钩子 
		Runtime.getRuntime().addShutdownHook(new Thread());
	
	}
}
