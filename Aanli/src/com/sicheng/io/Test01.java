package com.sicheng.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {

	private static final String LINE_SEPARATOR = System.lineSeparator();

	public static void main(String[] args) throws IOException {
		demo04();
	}

	public static void demo04() throws IOException {
		FileReader fr = new FileReader("demo.txt");
		/*
		 * 使用read(char[])读取文本文件数据
		 * 
		 * 先创建字符数组
		 */
		char[] buf = new char[1024];
		
		int len = 0;
		
		while((len = fr.read(buf)) != -1) {
			System.out.print(new String(buf,0,len));
		}
		
		/*int num = fr.read(buf);
		System.out.println(new String(buf,0,num));
		System.out.println(num);
		int num1 = fr.read(buf);
		System.out.println(new String(buf,0,num1));
		System.out.println(num1);*/
		
		fr.close();
	} 

	/*
	 * 需求:读取一个文本文件，将读取到的字符打印到控制台。
	 */
	public static void demo03() throws IOException {
		//创建一个能读取字符数据的流对象
		//在创建读取对象时，必须要明确被读取的文件，一定要确定该文件是存在的
		//用一个读取流关联一个已存在的文件。
		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			System.out.println(ch);
		}
		
		//用Reader中的reader方法读取字符
		/*int ch = fr.read();
		System.out.println(ch);
		int ch1 = fr.read();
		System.out.println(ch1);
		int ch2 = fr.read();
		System.out.println(ch2);*/
		fr.close();
	}

	public static void demo02() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt", true);
			fw.write("aa" + LINE_SEPARATOR + "bb");
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					throw new RuntimeException();
				}
			}
		}
	}

	public static void demo01() throws IOException {
		/*
		 * 如果文件不存在会自动创建
		 * 
		 * 如果文件存在则会被覆盖
		 * 
		 * 如果构造函数加入true可用实现对文件进行续写。
		 */
		FileWriter fw = new FileWriter("demo.txt",true);
		/*
		 * 调用Write对象中的write(String)方法，写入数据。
		 * 
		 * 其实数据写入到了临时存储缓冲区中
		 */
		fw.write("aa");
		fw.flush();
		// 关闭流，关闭系统资源，在关闭前，会调用flush刷新缓存中的数据到目的地。
		fw.close();
	}
	
}
