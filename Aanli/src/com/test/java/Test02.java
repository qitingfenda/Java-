package com.test.java;

public class Test02 {
	public static void main(String[] args) {
		
	}
}

class A{
	
	public String method() {
		return "a";
	}
	
	public final void method02() {
		
	}
}

class B extends A{
	
	/*public int method() {//重写返回值不一样时，编译会报错
		return 5;
	}*/
	/*public final void method02() {//重写final方法时，编译会报错
		
	}*/
}

