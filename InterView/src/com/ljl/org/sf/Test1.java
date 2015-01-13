package com.ljl.org.sf;

import java.math.BigInteger;

/**
 *@Author:liangjilong
 *@Date:2013-9-24
 *@Email:jilongliang@sina.com
 *@Version:Version1.0
 *@CopyRight:liangjilong
 *@Description:
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(xunHuan(10000));
		System.out.println(getResult(10000));

	}
	 /**
     * 循环实现求n的阶乘
     * @param n
     * @return
     */
    public static BigInteger xunHuan(long n) {
        BigInteger cBigInteger=BigInteger.valueOf(1);
        for (long i =1; i < n+1; i++) {
            cBigInteger=cBigInteger.multiply(BigInteger.valueOf(i));
        }
        return cBigInteger;
    }
    public static BigInteger getResult(long n) {
        if (n==1) {
            return BigInteger.valueOf(1);
        }
        else {
            return getResult(n-1).multiply(BigInteger.valueOf(n-1));
        }
    }
}
