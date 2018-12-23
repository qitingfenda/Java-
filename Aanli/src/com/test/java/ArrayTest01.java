package com.test.java;

import java.util.ArrayList;


public class ArrayTest01 {

	public static void main(String[] args) {
		Demo01();

	}

	public static void Demo01() {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc1");
		list.add("abc1");
		list.add("abc1");
		list.add("abc4");
		list.add("abc4");
		list.add("abc5");
		list.add("abc5");
		list.add("abc6");
		list.add("abc6");
		/*int len = list.size();
		for(int i = 0;i<len-1;i++) {
			System.out.println("循环:"+i);
			for(int j = i+1;j<len;j++) {
				if(list.get(i).equals(list.get(j))) {
					System.out.println("删除:"+list.get(j));
					list.remove(j);
					j--;
					len--;
				}
			}
		}
		System.out.println(list);*/
		
		ArrayList<String> subList = new ArrayList<>();
		
		for(int i = 0;i<list.size();i++) {
			System.out.println("你这有:"+list.get(i)+"这个元素吗？");
			if(subList.contains(list.get(i))) {
				System.out.println("有啊！");
				continue;
			}else {
				System.out.println("没有！");
				subList.add(list.get(i));
				System.out.println("那我添加了！");
			}
		}
		System.out.println(subList);
		
	}

}
