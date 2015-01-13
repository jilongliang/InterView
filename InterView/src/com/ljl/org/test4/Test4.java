package com.ljl.org.test4;
/**
 *@Author:liangjilong
 *@Date:2013-9-8
 *@Email:jilongliang@sina.com
 *@Version:Version1.0
 *@CopyRight:liangjilong
 *@Description:
 */
public class Test4 {
	private void test1(){
		System.out.println("test1");
	}
	public void test2(){
		System.out.println("test1");
	}
	protected void test3(){
		System.out.println("test1");
	}
	private final void test4(){
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
