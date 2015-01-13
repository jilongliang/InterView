package com.ljl.org.extend;

public class B extends A {

	float a = 3.0f;
	String d = "Java program.";

	void show() {
		super.show();
		System.out.println("Class B: a=" + a + "\td=" + d);
	}
}