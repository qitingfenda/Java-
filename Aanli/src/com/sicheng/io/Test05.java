package com.sicheng.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) throws IOException {
		demo02();
	}

	public static void demo02() throws IOException {
		// 1.创建一个读取流对象，和指定的文件关联
		FileInputStream fis = new FileInputStream("demo.txt");
		
		byte[] buf = new byte[fis.available()];
		
		fis.read(buf);
		
		System.out.println(new String(buf));
		
		//System.out.println(fis.available());
		
		//建议使用这种方法读取数据
		/*byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len = fis.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}*/
		
		
		// 一次读取一个字节
		/*int ch = 0;
		while((ch = fis.read()) != -1) {
			
			System.out.println((char)ch);
		}	*/	
		
		fis.close();
	}

	public static void demo01() throws IOException {
		// 1.创建字节输出流对象，用于操作文件
		FileOutputStream fos = new FileOutputStream("demo.txt");
		
		// 2.写数据，直接写道目的地中
		fos.write("sfd".getBytes());
		
		// 关闭资源动作要完成
		fos.close();
		
	}
	
}
