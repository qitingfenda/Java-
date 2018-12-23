package com.sicheng.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) throws IOException {
		demo02();
	}

	public static void demo02() throws IOException {
		// 1.����һ����ȡ�����󣬺�ָ�����ļ�����
		FileInputStream fis = new FileInputStream("demo.txt");
		
		byte[] buf = new byte[fis.available()];
		
		fis.read(buf);
		
		System.out.println(new String(buf));
		
		//System.out.println(fis.available());
		
		//����ʹ�����ַ�����ȡ����
		/*byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len = fis.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}*/
		
		
		// һ�ζ�ȡһ���ֽ�
		/*int ch = 0;
		while((ch = fis.read()) != -1) {
			
			System.out.println((char)ch);
		}	*/	
		
		fis.close();
	}

	public static void demo01() throws IOException {
		// 1.�����ֽ�������������ڲ����ļ�
		FileOutputStream fos = new FileOutputStream("demo.txt");
		
		// 2.д���ݣ�ֱ��д��Ŀ�ĵ���
		fos.write("sfd".getBytes());
		
		// �ر���Դ����Ҫ���
		fos.close();
		
	}
	
}
