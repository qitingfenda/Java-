package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aa {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("开始输入。。。。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		// line = br.readLine();
		
		// System.out.println(line);
		
		while((line = br.readLine()) != null) {
			if("over".equals(line)) {
				System.out.println("输入结束！");
				break;
			}
			System.out.println("用户输入:"+line);
		}
		
		br.close();
	}
}
