package com.sicheng.java;

public class Test04 {
	public static void main(String[] args) {
		ThrAbc abc = new ThrAbc();
		
		Thread thrAbc1 = new Thread(abc);
		Thread thrAbc2 = new Thread(abc);
		Thread thrAbc3 = new Thread(abc);
		Thread thrAbc4 = new Thread(abc);
		
		thrAbc1.start();
		thrAbc2.start();
		thrAbc3.start();
		thrAbc4.start();
	}
}
class ThrAbc implements Runnable {
	public static int num = 100;
	Object obj = new Object();
	@Override
	public void run() {
		while(true) {
			synchronized(obj) {
				if(num>=0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"....."+num--);
				}
			}
		}
	}
}