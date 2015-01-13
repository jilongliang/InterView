package com.ljl.org.sf;

/**
 *@Author:liangjilong
 *@Date:2014-6-7
 *@Version:1.0
 */
public class Test2 {
	
	public static void main(String[] args) {
		 double num = fun(100); //函数调用 ，表示有100层楼梯
		 System.out.println(num);
	//	 printf("%.0f\n",num);//输出的时候不保留小数点后边的数据
	}
	public static double fun(int n)  //这里的n不大于100
	{
	        int i;
	        double a[] = {0.0};//将数组中的值初始化为0.0
	        a[0] = 1.0;
	        a[1] = 2.0;
	        a[2] = 4.0;
	        for(i=3;i<n;i++)  //采用迭代法替换递归，用数组保存上一次数据结果，减少系统开销
	        {
	        a[i]=a[i-3]+a[i-2]+a[i-1];
	        }
	        return a[n-1]; //a[n-1]存放的数据就是n阶层的楼梯总共的走法
	}
}
