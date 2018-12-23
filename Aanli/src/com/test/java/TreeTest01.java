package com.test.java;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest01 {

	public static void main(String[] args) {
//		demo01();
//		demo02();
		demo03();
		
		
	}

	public static void demo03() {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int temp = o1.length() - o2.length();
				return temp==0?o1.compareTo(o2):temp;
			}
		});
		ts.add("sfd");
		ts.add("dsssdffd");
		ts.add("sdfdfdsfd");
		ts.add("sdfsdffd");
		ts.add("dsfs");
		ts.add("sfdfdsfsd");
		ts.add("sdfdsfdfds");
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void demo02() {
		TreeSet<Person> ts = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return 1;
			}
			
		});
		ts.add(new Person("zhangsan", 11));
		ts.add(new Person("lisi", 15));
		ts.add(new Person("wanger", 13));
		ts.add(new Person("wanger", 11));
		ts.add(new Person("zhouliu", 13));
		ts.add(new Person("zhaoqi", 18));
		Iterator<Person> it = ts.iterator();
		while(it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
		
	}

	public static void demo01() {
		TreeSet<Person> ts = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				Person p1 = (Person) o1;
				Person p2 = (Person) o2;
				int temp = p1.getName().compareTo(p2.getName());
				return temp==0?p1.getAge()-p2.getAge():temp;
			}
			
		});
		ts.add(new Person("zhangsan", 11));
		ts.add(new Person("lisi", 15));
		ts.add(new Person("wanger", 13));
		ts.add(new Person("wanger", 11));
		ts.add(new Person("zhouliu", 13));
		ts.add(new Person("zhaoqi", 18));
		Iterator<Person> it = ts.iterator();
		while(it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
