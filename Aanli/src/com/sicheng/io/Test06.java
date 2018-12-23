package com.sicheng.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
	
	public static void main(String[] args) throws IOException {
		demo02();
	}

	public static void demo04() throws IOException {
		// 速度最慢，不使用
		FileInputStream fis = new FileInputStream("C:\\Users\\七听芬达\\Videos\\01-计算机语言概述.avi");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\七听芬达\\Videos\\aa.avi");
		
		int ch = 0;
		
		while((ch = fis.read()) != -1) {
			fos.write(ch);
		}
		
		fis.close();
		fos.close();
	}

	public static void demo03() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\七听芬达\\Videos\\01-计算机语言概述.avi");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\七听芬达\\Videos\\aa.avi");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//不建议使用
		byte[] buf = new byte[fis.available()];
		
		bis.read(buf);
		bos.write(buf);
		
		bis.close();
		bos.close();
	}

	public static void demo02() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\七听芬达\\Videos\\01-计算机语言概述.avi");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\七听芬达\\Videos\\aa.avi");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
				
		int ch = 0;
		
		while((ch = bis.read()) != -1) {
			bos.write(ch);
			// bos.flush();
		}
		
		bis.close();
		bos.close();
	}

	public static void demo01() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\七听芬达\\Videos\\01-计算机语言概述.avi");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\七听芬达\\Videos\\aa.avi");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len = fis.read(buf)) != -1) {
			fos.write(buf,0,len);
		}
		
		fis.close();
		fos.close();
		
	}

}
