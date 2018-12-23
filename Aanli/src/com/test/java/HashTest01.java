package com.test.java;

import java.util.HashSet;

import java.util.Iterator;

public class HashTest01 {

	public static void main(String[] args) {
		// demo01();
		demo02();

	}

	public static void demo02() {
		// Person p1 = new Person("a1", 21);
		// System.out.println(p1);

		HashSet<Person> hs = new HashSet<Person>();
		hs.add(new Person("b1", 21));
		hs.add(new Person("b2", 22));
		hs.add(new Person("b3", 23));
		hs.add(new Person("b4", 24));
		hs.add(new Person("b4", 24));
		Iterator<Person> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void demo01() {
		HashSet<Object> hs = new HashSet<Object>();
		hs.add("r");
		hs.add("fsd");
		hs.add("fsd");
		hs.add("fsd");
		hs.add("ffdsesd");
		hs.add("ffdsesd");
		hs.add("ffdsesd");
		hs.add("er");
		hs.add("er");
		hs.add("er");

		Iterator<Object> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
