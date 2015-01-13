package com.ljl.org.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class LoginClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.1.102", 1092);
		System.out.println("请输入用户名:");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//只能输入3次
		for (int i = 0; i < 3; i++) {
			String line = buf.readLine();
			if (line == null)
				break;
			out.println(line);
			String info = bufIn.readLine();
			System.out.println(info);
			if(info.contains("欢迎")){
				break;
			}
		}
		buf.close();
		bufIn.close();
	}
}



