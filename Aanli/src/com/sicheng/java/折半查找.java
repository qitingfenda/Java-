package com.sicheng.java;

public class 折半查找 {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		System.out.println(zheBan(arr, 5));
	}
	public static int zheBan(int[] arr,int key) {
		int min,mid,max;
		min = 0;
		max = arr.length-1;
		while(min<=max) {
			mid = (min + max)/2;
			if(key > arr[mid]) {
				min = mid + 1;
			}else if(key < arr[mid]) {
				max = mid - 1;
			}else {
				return mid;
			}
			
		}
		
		return -1;
	}

}
