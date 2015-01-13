package com.ljl.org.thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *@Author:jilongliang
 *@Date  :2013-4-22
 *@Project:Interview
 *@Class:LoginServer.java
 *@Description:
 */
public class LoginServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(1092);
		while (true) {
			Socket s = ss.accept();
			new Thread(new UserThread(s)).start();//启动一个线程
		}
	}
}

/**
 * 实现Runnable
 *
 */
class UserThread implements Runnable {
	private Socket s;
	UserThread(Socket s) {
		this.s = s;
	}
	@Override
	public void run() {
		String ip = s.getInetAddress().getHostName();
		System.out.println(ip);
		try {
			for (int i = 0; i < 3; i++) {
				BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				String name = bufIn.readLine();// name 每一行去读取
				String path="D:/MyEclipse/Interview/src/com/ljl/org/thread/user.txt";
				BufferedReader bufr = new BufferedReader(new FileReader(path));
				if(name==null)
					break;
				PrintWriter out = new PrintWriter(s.getOutputStream(), true);
				String line = null;
				boolean flag = false;
				while ((line = bufr.readLine()) != null) {
					if (line.equals(name)) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println(name + "已登录");
					out.println(name + "欢迎光临");
				} else {
					System.out.println(name + "不存在!");
					out.println(name + "欢迎光临");
				}
			}
			s.close();
		} catch (Exception e) {
			//throw new RuntimeException("校正失败!");
			System.out.println("校正失败!");
			e.printStackTrace();
		} 
	}

}
