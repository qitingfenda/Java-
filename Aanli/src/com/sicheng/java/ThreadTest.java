package com.sicheng.java;

/*class Demo01 implements Runnable{
	public void run() {
		for(int i = 1;i<10;i++) {
			System.out.println("aa..."+i+"..."+Thread.currentThread().getName());
		}
	}
}*/
public class ThreadTest {

	public static void main(String[] args) {
		/*Demo01 demo01 = new Demo01();
		Thread t1 = new Thread(demo01);
		Thread t2 = new Thread(demo01);
		t1.start();
		t2.start();*/
	}

}
/*class Thread{
	private Runnable r;
	public Thread(){
		
	}
	public Thread(Runnable r) {
		this.r = r;
	}
	public void run() {
		if(r != null) {
			r.run();
		}
	}
	public void start() {
		r.run();
	}
}
class ThreadImpl implements Runnable{
	public void run() {
		System.out.println("runnable run");
	}
}
ThreadImpl impl = new ThreadImpl();
Thread thread = new Thread(impl);

class Demo0a extends Thread{
	public void run() {
		System.out.println("aa");
	}
	
}*/




















