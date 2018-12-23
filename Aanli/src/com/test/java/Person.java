package com.test.java;

public class Person implements Comparable<Object>{
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return false;
		}
		if(!(obj instanceof Person)) {
			throw new ClassCastException("¿‡–Õ¥ÌŒÛ£°");
		}
		Person p = (Person) obj;
		return this.name.equals(p.name) && this.age == p.age;
	}

	@Override
	public String toString() {

		return "[" + this.name + ":" + this.age + "]";
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		int temp = this.age - p.age;
		return temp==0?this.name.compareTo(p.name):temp;
	}
}
