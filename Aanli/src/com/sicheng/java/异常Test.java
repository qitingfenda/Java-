package com.sicheng.java;

class NegativeIndexException extends Exception{
	private static final long serialVersionUID = 1L;
	public NegativeIndexException() {}
	public NegativeIndexException(String str) {
		super(str);
	}
}
class Demo{
	public int method(int[] arr,int index)throws NegativeIndexException {
		if(arr == null) {
			throw new NullPointerException("空指针异常！");
		}
		if(index >= arr.length) {
			throw new IndexOutOfBoundsException("角标越界！");
		}
		if(index < 0) {
			throw new NegativeIndexException("角标不能为负数！");
		}
		return arr[index];
	}
}
public class 异常Test {
	private static Demo demo;

	public static void main(String[] args)throws NegativeIndexException {
		int[] arr = new int[3];
		demo = new Demo();
		demo = null;
		try {
			int num = demo.method(arr,-3);
			System.out.println("num="+num);
			
		} catch (NullPointerException e) {
			System.out.println("空指针异常!!!!");
		}catch (NegativeIndexException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.out.println(e.toString());
			System.out.println("角标不能为负数!!!!");
		}catch (Exception e) {
			System.out.println("其他异常!!!!");
		}
	}
}
