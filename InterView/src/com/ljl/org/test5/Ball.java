package com.ljl.org.test5;

/**
 * @Author:liangjilong
 * @Date:2014-6-23
 * @Version:1.0
 * @Description:
 * interface默认为public static final
 */

interface Playable {
	void play();
}

interface Bounceable {
	void play();
}

interface Rollable extends Playable, Bounceable {
	Ball b = new Ball("bbbb");
}

class Ball implements Rollable {
	private String name;

	public String getName() {
		return name;
	}

	public Ball(String name) {
		this.name=name;
	}

	@Override
	public void play() {
		////Ball实现了Rollable由于接口是final修饰的,不可以修改的此行代码报错
		//b = new Ball("ff");
		System.out.println(b.getName());

	}
}
