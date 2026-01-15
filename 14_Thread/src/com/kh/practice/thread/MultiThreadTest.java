package com.kh.practice.thread;

public class MultiThreadTest {
			public static void main(String[] args) {
				Data data = new Data();
				Thread putThread = new Provider(data);
				Thread getTheread = new Customer(data);
				
				
				putThread.start();
				getTheread.start();
				
			}
}	
