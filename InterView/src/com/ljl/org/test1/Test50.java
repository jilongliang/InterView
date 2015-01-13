package com.ljl.org.test1;

/**
 *@Author:jilongliang
 *@Date  :2013-3-7
 *@Project:Interview
 *@Class:Test50.java
 *@Description:
 */
import java.io.*;
import java.util.*;
public class Test50 {
	/**
	 *题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），
	 *计算出平均成绩，把原有的数据和计算出的平均分数存放在磁盘文件 "stud "中.
	 */
	public static void main(String[] args) throws IOException {
		Scanner ss = new Scanner(System.in);
		String[][] a = new String[5][6];
		for (int i = 1; i < 6; i++) {
			System.out.print("请输入第" + i + "个学生的学号：");
			a[i - 1][0] = ss.nextLine();
			System.out.print("请输入第" + i + "个学生的姓名：");
			a[i - 1][1] = ss.nextLine();
			for (int j = 1; j < 4; j++) {
				System.out.print("请输入该学生的第" + j + "个成绩：");
				a[i - 1][j + 1] = ss.nextLine();
			}
			System.out.println("\n");
		}// 以下 计算平均分
		float avg;
		int sum;
		for (int i = 0; i < 5; i++) {
			sum = 0;
			for (int j = 2; j < 5; j++) {
				sum = sum + Integer.parseInt(a[i][j]);
			}
			avg = (float) sum / 3;
			a[i][5] = String.valueOf(avg);
		}
		// 以下写磁盘文件
		String s1;
		File f = new File("C:\\stud");
		if (f.exists()) {
			System.out.println("文件存在");
		} else {
			System.out.println("文件不存在，正在创建文件");
			f.createNewFile();// 不存在则创建
		}
		BufferedWriter output = new BufferedWriter(new FileWriter(f));
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				s1 = a[i][j] + "\r\n";
				output.write(s1);
			}
		}
		output.close();
		System.out.println("数据已写入c盘文件stud中！");
	}
}