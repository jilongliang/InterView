package com.ljl.org.test4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @Author:liangjilong
 * @Date:2013-9-17
 * @Email:jilongliang@sina.com
 * @Version:Version1.0
 * @CopyRight:liangjilong
 * @Description: 
 */
public class Test5 {
	public static void main(String[] args) throws Exception{
		FileManager a=new FileManager("D:/test/a.txt", new  char[]{'\n'});
		FileManager b=new FileManager("D:/test/b.txt", new  char[]{'\n',' '});
		
		FileWriter writer=new FileWriter("D:/test/c.txt");
		String aWord=null;
		String bWord=null;
		while((aWord=a.nextWord())!=null){
			writer.write(aWord+"\n");
			bWord=b.nextWord();
			if(bWord!=null)
			writer.write(bWord+"\n");
			
			while((bWord=b.nextWord())!=null){
				writer.write(bWord+"\n");
			}
		}
		writer.close();
	}
}

/**
 *@Author:liangjilong
 */
class FileManager {
	String[] words = null;
	int pos = 0;

	public FileManager(String fileName, char[] seperators) throws Exception {
		File f = new File(fileName);
		FileReader reader = new FileReader(f);
		char[] buf = new char[(int) f.length()];
		int len = reader.read(buf);
		String results = new String(buf, 0, len);
		String regex = null;
		if (seperators.length > 1) {
			regex = "" + seperators[0] + "|" + seperators[1];
		} else {
			regex = "" + seperators[0];
		}
		words = results.split(regex);
	}

	public String nextWord() {
		if (pos == words.length) {
			return null;
		}
		return words[pos++];
	}
}
