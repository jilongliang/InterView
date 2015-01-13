package com.ljl.org.test5;
/**
 * @Author:liangjilong
 * @Date:2014-6-23
 * @Version:1.0
 * @Description:
 */

interface A {
	int x=0;
}
class B {
	int x=1;
}

public class C extends B implements A {
	
	public void pX(){
		//System.out.println(x);//
	}
	
	public static void main(String[] args) {
		new C().pX();
	}
}


