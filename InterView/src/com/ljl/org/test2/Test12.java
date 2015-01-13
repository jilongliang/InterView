package com.ljl.org.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *@DEMO:Interview
 *@Author:jilongliang
 *@Date:2013-3-20
 */

/**
 * 3.编写一个程序 ， 将 d:\java 目录下的所有 .java 文件复制 到 d:\jad 目录下,并将原来文件的扩展名从 .java 改 为
 * .jad .这些简单问题的代码 ) 答 ： listFiles 方法接受一个 FileFilter 对象 ， 这个 FileFilter 对象就是过虑
 * 的策略对象 ， 不同的人提供不同的 FileFilter 实现 ， 即提供了不同的过滤策略 。
 */
public class Test12 {
	public static void main(String[] args) throws Exception {
		File srcDir = new File("java");
		if (!(srcDir.exists() && srcDir.isDirectory()))
			throw new Exception(" 目录不存在 ");
		File[] files = srcDir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		System.out.println(files.length);
		File destDir = new File("jad");
		if (!destDir.exists())
			destDir.mkdir();
		for (File f : files) {
			FileInputStream fis = new FileInputStream(f);
			String destFileName = f.getName().replaceAll("\\.java$", ".jad");
			FileOutputStream fos = new FileOutputStream(new File(destDir,
					destFileName));
			copy(fis, fos);
			fis.close();
			fos.close();
		}
	}

	private static void copy(InputStream ips, OutputStream ops)
			throws Exception {
		int len = 0;
		byte[] buf = new byte[1024];
		while ((len = ips.read(buf)) != -1) {
			ops.write(buf, 0, len);
		}
	}
}
