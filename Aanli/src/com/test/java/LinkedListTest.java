package com.test.java;

import java.util.LinkedList;

class DuiLie{
	private LinkedList<Object> linkedList;
	
	public DuiLie() {

		linkedList = new LinkedList<>();
	}
	
	public void myAdd(Object obj) {
		linkedList.addLast(obj);
	}
	public Object myGet() {
		return linkedList.removeFirst();
	}
	public boolean isNull(){
		return linkedList.isEmpty();
	}
}


public class LinkedListTest {

	public static void main(String[] args) {
		demo();
		System.out.println();
		demo02();

	}

	public static void demo02() {
		DuiLie duiLie = new DuiLie();
		duiLie.myAdd("qwe1");
		duiLie.myAdd("qwe2");
		duiLie.myAdd("qwe3");
		duiLie.myAdd("qwe4");
		while(!duiLie.isNull()) {
			System.out.println(duiLie.myGet());
		}
	}

	public static void demo() {
		LinkedList<String> link = new LinkedList<>();
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		while(!link.isEmpty()) {
			System.out.println(link.removeFirst());
		}
	}

}
