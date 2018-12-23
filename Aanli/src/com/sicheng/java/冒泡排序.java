package com.sicheng.java;

import java.util.Arrays;

public class 冒泡排序 {

	public static void main(String[] args) {
		System.out.print("随机生成的数组为:");
		int arr[] = new int[10];//改变数值实现自定义个随机生成的数进行排序
		for(int i = 0;i<=arr.length-1;i++) {
			int num = (int)(Math.random()*100);//该表数值进行范围的选定
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("排序后的数组为 : ");
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {//该表大于小于号使得数组从大从小排序(大于号表示从小到大排序，小于号从大到小排序)
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
}
