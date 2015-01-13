package com.ljl.org.tuxing;

public class Draw {
	private char fillChar;

	public Draw(char fillChar) {
		this.fillChar = fillChar;
	}

	/**
	 * 根据两个点画线在二维字符数组上画线
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param canvas
	 */
	public void drawLine(double x1, double y1, double x2, double y2,
			char[][] canvas) {
		int radius = (canvas.length - 1) / 2;
		// 从 x 方向进行填充
		if (x1 > x2) {
			double t = x1;
			x1 = x2;
			x2 = t;
			t = y1;
			y1 = y2;
			y2 = t;
		}

		// 获得直线方程的两个系数
		double a = (y1 - y2) / (x1 - x2);
		double b = y1 - a * x1;

		// 根据 x 方向的值求出 y 值，并填充图形
		for (int i = (int) Math.round(x1); i <= (int) Math.round(x2); i++) {
			// 根据直线方程 y = ax + b，求 y
			int y = (int) Math.round(a * i + b);

			// 因为 y 和 i 算出来的结果有可能是负数，
			// 为了采用数组来表示坐标，做了以下变换
			// c[R][R] 即为坐标原点
			// c[R][0..R] 为 x 方向的负半轴
			// c[R][R+1..2*R] 为 x 方向的正半轴
			// c[0..R][R] 为 y 方向的正半轴
			// c[R+1..2*R][R] 为 y 方向的负半轴
			int yy = radius - y;
			int xx = radius + i;

			yy = yy < 0 ? 0 : yy;
			yy = yy > 2 * radius ? 2 * radius : yy;
			xx = xx < 0 ? 0 : xx;
			xx = xx > 2 * radius ? 2 * radius : xx;

			canvas[yy][xx] = fillChar;
		}

		// 从 y 方向进行填充，便于减少间距问题产生的字符空档
		if (y1 > y2) {
			double t = x1;
			x1 = x2;
			x2 = t;
			t = y1;
			y1 = y2;
			y2 = t;
		}

		// 根据 y 方向的值求出 x 值，并填充图形
		for (int i = (int) Math.round(y1); i <= (int) Math.round(y2); i++) {
			// 根据 x = (y - b) / a，求 x
			int y = (int) Math.round((i - b) / a);

			int yy = radius - i;
			int xx = radius + y;

			yy = yy < 0 ? 0 : yy;
			yy = yy > 2 * radius ? 2 * radius : yy;
			xx = xx < 0 ? 0 : xx;
			xx = xx > 2 * radius ? 2 * radius : xx;

			canvas[yy][xx] = fillChar;
		}
	}

	/**
	 * 将画完图之后的画布输出到控制台上
	 * 
	 * @param canvas
	 */
	public static void printCanvas(char[][] canvas) {
		for (int i = 0; i < canvas.length; i++) {
			for (int j = 0; j < canvas[i].length; j++) {
				System.out.print(canvas[i][j]);
			}
			System.out.println();
		}
	}

}
