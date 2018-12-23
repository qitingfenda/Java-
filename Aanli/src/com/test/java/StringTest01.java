package com.test.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringTest01 {

	public static void main(String[] args) {
//		demo01();
//		demo02();
		demo03();
	}

	public static void demo03() {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			System.out.print(it.previous()+" ");
		}
	}

	public static void demo02() {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("迭代器:" + it.next());
		}
		for (Object e : list) {
			System.out.println("加强型for循环:" + e);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("普遍for循环+get:" + list.get(i));
		}
	}

	public static void demo01() {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		// 添加元素
		// list.add(1,"abc9");
		// 删除元素
		// System.out.println("remove:"+list.remove(1));
		// 修改元素
		// System.out.println("set:"+list.set(2, "abc7"));
		// 获取子字符串
		// System.out.println("sublist:"+list.subList(0, 1));

		System.out.println(list);
	}

}
