package com.bluemobi;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world");
		String str = "helloworld petter";
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("你知道个毛");
			}
		}).start();
	}
}
