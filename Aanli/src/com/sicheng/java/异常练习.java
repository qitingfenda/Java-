package com.sicheng.java;

public class 异常练习 {

	public static void main(String[] args) throws NoPlanException{
		Teacher teacher = new Teacher("程老师");
		try {
			teacher.teach();
		} catch (NoPlanException e) {
			System.out.println(e.toString());
			System.out.println(e.toString()+"....");
			System.out.println("换人");
//			Teacher teacher2 = new Teacher("张老师");
//			teacher2.teach();
		}
	}
}
class Teacher{
	private String name;
	private Computer comp;
	public Teacher(String name) {
		this.name = name;
		comp = new Computer();
	}
	public void teach() throws NoPlanException{
		try {
			comp.run();
			System.out.println(this.name+":开始讲课！");
		} catch (LanPingException e) {
			System.out.println(e.toString());
			comp.reset();
			System.out.println(this.name+":开始讲课！");
		}
		catch (MaoYanException e) {
			System.out.println(e.toString());
			test();
			throw new NoPlanException("课时进度无法完成"+e.getMessage());
		}
	}
	public void test() {
		System.out.println("大家做练习！！！");
	}
}
class Computer {
	private int state = 2;
	public void run() throws LanPingException,MaoYanException{
		System.out.println("电脑运行！");
		if(this.state == 1) {
			throw new LanPingException("电脑蓝屏了！！！");
		}
		if(this.state == 2) {
			throw new MaoYanException("电脑冒烟了！！！");
		}
	}
	public void  reset() {
		this.state = 0;
		System.out.println("电脑重启！！！");
	}
}

class LanPingException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LanPingException(String msg) {
		super(msg);
	}
}

class MaoYanException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MaoYanException(String msg){
		super(msg);
	}
}
class NoPlanException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoPlanException(String msg) {
		super(msg);
	}
}


















