package com.ljl.org.test2;
import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		File file = new File("E:" + File.separator );
		getFileLists(file);
	}

	public static void getFileLists(File file) {
		//如果是目录就遍历
		if (file.isDirectory()) {
			File f[] = file.listFiles();
			if (f != null) {
				for (int x = 0; x < f.length; x++) {
					getFileLists(f[x]);//递归
				}
			}
		} else {
			System.out.println(file);
		}
	}
}
