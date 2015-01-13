package com.ljl.org.test4;

/**
 *@DEMO:Interview
 *@Author:jilongliang
 *@Date:2013-4-17
 *
 * 分别使用Runnable接口和Thread类编程实 
 * 
 * 编写一应用程序创建两个线程一个线程打印输出1—1000之间所有的奇数(Odd Number)
 * 
 * 另外一个线程打印输出1-1000之间所有的偶数(Even Number)要求两个线程随机休眠一 
 * 
 * 段时间后 继续打印输出下一个数
 * 
 * 创建线程有两种方式: 1.实现Runnable接口 2.继承Thread类
 * 实现方式和继承方式有啥区别？ 
 * 实现方式的好处:避免了单继承的局限性 在定义线程时.
 * 建议使用实现方式
 * 区别:
 *   继承Thread:线程代码存放Thread子类run方法中 实现
 *   Runnable:线程代码存放接口的子类的run方法
 *   wait释放资源,释放锁
 *   sleep释放资源,不释放锁
 */
@SuppressWarnings("all")
public class Thread1 {
	public static void main(String[] args) {
		
	  //方法一
	  /* OddNumber js = new OddNumber();
		js.start();
		EvenNumber os = new EvenNumber();
		os.start();
		while (true) {
			if (js.i1 == 1000 || os.i2 == 1000) {
				System.exit(-1);
			}
		}
		*/ 
	    //方法二
		OddNum on=new OddNum();
		EvenNum en=new EvenNum();
		new  Thread(on).start();
		new  Thread(en).start();
		while (true) {
			if (on.i1 == 1000 || en.i2 == 1000) {
				System.exit(-1);
			}
		}
		
	}
}
/**
 * ============================继承Thread的线程===============================
 */
class EvenNumber extends Thread {
	int i2;
	@Override
	public void run() {
		for (i2 = 1; i2 <= 1000; i2++) {
			if (i2 % 2 == 0) {
				System.out.println("偶數" + i2);
			}
			try {
				sleep((int) (Math.random() * 500) + 500);
			} catch (Exception e) {
			}
		}
	}
}

class OddNumber extends Thread {
	int i1;
	@Override
	public void run() {
		for (i1 = 1; i1 <= 1000; i1++) {
			if (i1 % 2 != 0) {
				System.out.println("奇數" + i1);
			}
			try {
				sleep((int) (Math.random() * 500) + 500);
			} catch (Exception e) {
			}
		}
	}
}

/**
 * ============================实现Runnable的线程===============================
 */
@SuppressWarnings("all")
class OddNum implements Runnable {
	int i1;
	@Override
	public void run() {
		for (i1 = 1; i1 <= 1000; i1++) {
			if (i1 % 2 != 0) {
				System.out.println("奇數" + i1);
			}
			try {
				new Thread().sleep((int) (Math.random() * 500)+500);
			} catch (Exception e) {
			}
		}
	}
}
@SuppressWarnings("all")
class EvenNum implements Runnable {
	int i2;
	@Override
	public void run() {
		for (i2 = 1; i2 <= 1000; i2++) {
			if (i2 % 2 == 0) {
				System.out.println("偶數" + i2);
			}
			try {
			/**在指定的毫秒数内让当前正在执行的线程休眠
			 * Math.random()一个小于1的随机数乘于500+500，随眠时间不会超过1000毫秒	
			 */
			//new Thread().sleep((int) (Math.random() * 500)+500);
			new Thread().sleep(1000);//也可以指定特定的参数毫秒
			} catch (Exception e) {
			}
		}
	}
}