package com.test.java;

@SuppressWarnings("hiding")
class  Tool<Object>{
	private Object obj;

	public Object getObject() {
		return obj;
	}

	public void setObject(Object object) {
		this.obj = object;
	}
	
}

class Student{
	
}

public class test01 {
	public static void main(String[] agrs){
		
		Tool<Person> t = new Tool<Person>();
		
		t.setObject(new Person());
		
		Person p = (Person) t.getObject();
		
		System.out.println(p);
		
	}
	
	
}
