package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aa {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("��ʼ���롣������");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		// line = br.readLine();
		
		// System.out.println(line);
		
		while((line = br.readLine()) != null) {
			if("over".equals(line)) {
				System.out.println("���������");
				break;
			}
			System.out.println("�û�����:"+line);
		}
		
		br.close();
	}
}
