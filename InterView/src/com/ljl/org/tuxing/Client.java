package com.ljl.org.tuxing;


public class Client {
	public static void main(String[] args) {
		// 画一个半径为10，旋转为0，空白为全身空格，填充为★的五角星
		Pentagram pen = new Pentagram(10, 0, '　', '★');
		// 在控制台上输出这个五角星
		Draw.printCanvas(pen.getPentagram());

	}
}
