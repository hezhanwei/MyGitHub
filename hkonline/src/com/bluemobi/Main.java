package com.bluemobi;

public class Main {
	//add singleTon
	private static Main main = null;
	private Main(){}
	public Main getInstance(){
		if (main==null) {
			synchronized (Main.class) {
				if (main==null) {
					main = new Main();
				}
			}
		}
		return main;
	}

	public static void main(String[] args) {
		System.out.println("hello world");
		String str = "helloworld petter";
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("你知道个毛");
			}
		}).start();
		
		new Thread(){
			@Override
			public void run() {
				System.out.println("你碉堡了。。");
			}
		}.start();
		
		
	}
}
