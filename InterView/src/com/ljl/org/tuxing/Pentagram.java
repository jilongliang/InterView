package com.ljl.org.tuxing;


public class Pentagram {
	private final char FILL_CHAR; // 填充字符
	private final char SPACE_CHAR; // 空档字符
	private final int R; // 五角星的外接圆半径
	private final float ROTATION; // 五角星逆时针旋转角度
	private final int X; // 用于生成画图数组
	private final int Y; // 用于生成画图数组

	/**
	 * 构造一个Pentagram对象
	 * 
	 * @param radius
	 *            五角星的半径
	 * @param rotation
	 *            五角星的逆时针旋转度数
	 * @param spaceChar
	 *            画布上空白处填充字符
	 * @param fillChar
	 *            画布上线条部分填充字符
	 */
	public Pentagram(int radius, float rotation, char spaceChar, char fillChar) {
		this.R = radius;
		this.ROTATION = rotation;
		this.FILL_CHAR = fillChar;
		this.SPACE_CHAR = spaceChar;
		this.X = 2 * R + 1;
		this.Y = 2 * R + 1;
	}

	public char[][] getPentagram() {
		char[][] canvas = initCanvas();
		Draw draw = new Draw(FILL_CHAR);
		// 设五角星的最右边的一个点为 A，逆时针选取点 B~E
		// 通过圆的极坐标公式可以得出：
		// 得出以下各点的坐标
		// A 点坐标(0.951R, 0.309R)
		// B 点坐标(0, R)
		// C 点坐标(-0.951R, 0.309R)
		// D 点坐标(-0.588R, -0.809R)
		// E 点坐标(0.588R, -0.809R)

		// 画线段CA
		draw.drawLine(mcos(162) * R, msin(162) * R, mcos(18) * R, msin(18) * R,
				canvas);
		// 画线段DA
		draw.drawLine(mcos(234) * R, msin(234) * R, mcos(18) * R, msin(18) * R,
				canvas);
		// 画线段CE
		draw.drawLine(mcos(162) * R, msin(162) * R, mcos(306) * R, msin(306)
				* R, canvas);
		// 画线段DB
		draw.drawLine(mcos(234) * R, msin(234) * R, mcos(90) * R, msin(90) * R,
				canvas);
		// 画线段BE
		draw.drawLine(mcos(90) * R, msin(90) * R, mcos(306) * R, msin(306) * R,
				canvas);
		return canvas;
	}

	// 在方形的字符数组中指定两点画线条
	// 对图形数组进行初始化，填充空格
	private char[][] initCanvas() {
		char[][] canvas = new char[Y][X];
		for (int i = 0; i < Y; i++) {
			for (int j = 0; j < X; j++) {
				canvas[i][j] = SPACE_CHAR;
			}
		}
		return canvas;
	}

	// 根据角度求正弦值，保留两位小数
	private double msin(float a) {
		return ((int) (Math.sin(Math.toRadians(a + ROTATION)) * 100)) / 100.0;
	}

	// 根据角度求余弦值，保留两位小数
	private double mcos(float a) {
		return ((int) (Math.cos(Math.toRadians(a + ROTATION)) * 100)) / 100.0;
	}

}
