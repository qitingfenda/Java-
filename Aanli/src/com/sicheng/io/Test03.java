package com.sicheng.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {

	// private static final String LINE_SEPARATOR = System.lineSeparator();

	public static void main(String[] args) throws IOException {
		demo04();
	}

	public static void demo04() throws IOException {
		FileReader fr = new FileReader("demo.txt");

		MyBufferedReader myBufferedReader = new MyBufferedReader(fr);

		String line = null;
		
		while((line = myBufferedReader.myReadLine()) != null) {
			System.out.println(line);
		}
		
		/*int len = 0;
		while((len = myBufferedReader.myRead()) != -1) {
			System.out.println(len);
		}*/
		
		myBufferedReader.myclose();
	}

	public static void demo03() throws IOException {
		FileReader fr = new FileReader("demo.txt");
		BufferedReader bufr = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("demo2.txt");
		BufferedWriter bufw = new BufferedWriter(fw);
		
		/*String line = null;
		while((line = bufr.readLine()) != null) {
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}*/
		
		int len = 0;
		
		while((len = bufr.read()) != -1) {
			bufw.write(len);
			System.out.println(len);
		}
		
		bufw.close();
		bufr.close();
		
	}

	public static void demo02() throws IOException {
		FileReader fr = new FileReader("demo.txt");
		
		BufferedReader bufr = new BufferedReader(fr);
		
		String line = null;
		
		while((line = bufr.readLine()) != null) {
			// readLine使用了读取缓冲区的read方法，将读取到的字符进行缓冲并判断
			// 换行标记。将标记前的缓冲数据变成字符串返回。
			System.out.println(line);
		}
		
		/*String line01 = bufr.readLine();
		System.out.println(line01);
		
		String line02 = bufr.readLine();
		System.out.println(line02);
		
		String line03 = bufr.readLine();
		System.out.println(line03);
		
		String line04 = bufr.readLine();
		System.out.println(line04);*/
		
		
		bufr.close();
		
	}

	public static void demo01() throws IOException {
		FileWriter fw = new FileWriter("demo.txt");

		// 为了提高写入的效率，使用了字符流的缓冲区。
		// 创建了一个字符写入流的缓冲区对象，冰河指定要被缓冲的对象相关联。
		BufferedWriter bufw = new BufferedWriter(fw);

		for(int i = 1;i <= 10;i++) {
			bufw.write("sfsdfsdf");
			bufw.newLine();
			bufw.flush();
		}
		
		
		// 使用缓冲区的写入方法将数据写入到缓冲区
		// bufw.write("aafds"+LINE_SEPARATOR+"faf");
		// bufw.write("aafdsfaf");
		// bufw.newLine();
		// bufw.write("sdfdfd");
		// 使用缓冲区的刷新方法将数据刷新到目的地中
		
		// 关闭缓冲区，其实关闭的就是被缓冲的流对象
		bufw.close();
	}
}
