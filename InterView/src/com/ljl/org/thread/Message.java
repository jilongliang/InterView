package com.ljl.org.thread;

public class Message {

	public static int id;
	public String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		Message.id = id;
	}
}
