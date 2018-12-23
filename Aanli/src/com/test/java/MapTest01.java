package com.test.java;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest01 {

	public static void main(String[] args) {
//		demo01();
//		demo02();
//		demo03();
		demo04();
	}
	
	public static void demo04() {
		Map<Person, String> hm = new HashMap<>();
		hm.put(new Person("张山",15),"北京");
		hm.put(new Person("李四",12),"上海");
		hm.put(new Person("王二",17),"杭州");
		hm.put(new Person("周六",18),"深圳");
		hm.put(new Person("周六",18),"广州");
		
		Iterator<Entry<Person,String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	public static void demo03() {
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(3, "zhangshan");
		hm.put(7, "wanger");
		hm.put(8, "李四");
		hm.put(45, "zhaoliu");
		hm.put(22, "孙七");
		Set<Entry<Integer, String>> set = hm.entrySet();
//		for(Entry<Integer, String> e : set) {
//			System.out.println(e);
//		}
		Iterator<Entry<Integer, String>> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	public static void demo02() {
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(3, "zhangshan");
		hm.put(7, "wanger");
		hm.put(8, "李四");
		hm.put(45, "zhaoliu");
		hm.put(22, "孙七");
		Set<Integer> set = new HashSet<>();
		set = hm.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println(i+"="+hm.get(i));
		}
//		for(Integer e:set) {
//			System.out.println(e+"="+hm.get(e));
//		}
		
		
	}

	public static void demo01() {
		Map<Integer,String> hm = new HashMap<Integer,String>();
//		System.out.println(hm.put(8, "aa"));
//		System.out.println(hm.put(8, "bb"));
		hm.put(7, "a5763");
		hm.put(4, "567");
		hm.put(10, "a4");
		hm.put(29, "4");
		hm.put(5, "ajy");
		System.out.println(hm);
		hm.remove(5);
		System.out.println(hm);
		System.out.println(hm.get(10));
		System.out.println(hm.containsValue("24"));
		hm.clear();
		System.out.println(hm);
		
	}

}
