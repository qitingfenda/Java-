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
			System.out.println("ѭ��:"+i);
			for(int j = i+1;j<len;j++) {
				if(list.get(i).equals(list.get(j))) {
					System.out.println("ɾ��:"+list.get(j));
					list.remove(j);
					j--;
					len--;
				}
			}
		}
		System.out.println(list);*/
		
		ArrayList<String> subList = new ArrayList<>();
		
		for(int i = 0;i<list.size();i++) {
			System.out.println("������:"+list.get(i)+"���Ԫ����");
			if(subList.contains(list.get(i))) {
				System.out.println("�а���");
				continue;
			}else {
				System.out.println("û�У�");
				subList.add(list.get(i));
				System.out.println("��������ˣ�");
			}
		}
		System.out.println(subList);
		
	}

}
