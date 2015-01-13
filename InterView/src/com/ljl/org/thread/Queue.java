package com.ljl.org.thread;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	List<Message> queue = new ArrayList<Message>();

	int maxMessageNum = 5;

	public synchronized void produce(Message message) {

		this.notifyAll();
		while (queue.size() == maxMessageNum) {
			System.out.println(Thread.currentThread().getName()
					+ "  生产者......");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		queue.add(message);
		System.out.println(Thread.currentThread().getName() + "产品"
				+ message.getContent() + "......  ,产品量:" + getCount());

	}

	public synchronized void consume() {

		this.notifyAll();
		while (queue.size() == 0) {
			System.out.println(Thread.currentThread().getName()
					+ "  队列......");
			try {
				System.out.println("begin!");
				wait();
				System.out.println("end!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Message message = queue.get(0);
		queue.remove(0);
		System.out.println(Thread.currentThread().getName() + "队列"
				+ message.getContent() + "...... ,队列个数: " + getCount());

	}

	public synchronized int getCount() {
		return queue.size();
	}
}
