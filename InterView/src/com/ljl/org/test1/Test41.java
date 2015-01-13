package com.ljl.org.test1;

/**
 * @Author:jilongliang
 * @Date :2013-3-7
 * @Project:Interview
 * @Class:Test41.java
 * @Description:
 */
public class Test41 {
	/**
	 * 题目：海滩上有一堆桃子，五只猴子来分.第一只猴子把这堆桃子凭据分为五份，多了一个
	 * 这只猴子把多的一个扔入海中，拿走了一份.第二只猴子把剩下的桃子又平均分成五份，又多
	 * 了一个，它同样把多的一个扔入海中,拿走了一份，第三、第四、第五只猴子都是这样做的，
	 * 问海滩上原来最少有多少个桃子？   
	 * @param args
	 */
	public static void main(String[] args) {
		int i, m, j = 0, k, count;
		for (i = 4; i < 10000; i += 4) {
			count = 0;
			m = i;
			for (k = 0; k < 5; k++) {
				j = i / 4 * 5 + 1;
				i = j;
				if (j % 4 == 0)
					count++;
				else
					break;
			}
			i = m;
			if (count == 4) {
				System.out.println("原有桃子 " + j + " 个");
				break;
			}
		}
	}
}