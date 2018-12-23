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
			// readLineʹ���˶�ȡ��������read����������ȡ�����ַ����л��岢�ж�
			// ���б�ǡ������ǰ�Ļ������ݱ���ַ������ء�
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

		// Ϊ�����д���Ч�ʣ�ʹ�����ַ����Ļ�������
		// ������һ���ַ�д�����Ļ��������󣬱���ָ��Ҫ������Ķ����������
		BufferedWriter bufw = new BufferedWriter(fw);

		for(int i = 1;i <= 10;i++) {
			bufw.write("sfsdfsdf");
			bufw.newLine();
			bufw.flush();
		}
		
		
		// ʹ�û�������д�뷽��������д�뵽������
		// bufw.write("aafds"+LINE_SEPARATOR+"faf");
		// bufw.write("aafdsfaf");
		// bufw.newLine();
		// bufw.write("sdfdfd");
		// ʹ�û�������ˢ�·���������ˢ�µ�Ŀ�ĵ���
		
		// �رջ���������ʵ�رյľ��Ǳ������������
		bufw.close();
	}
}
