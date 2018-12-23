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
		 * ʹ��read(char[])��ȡ�ı��ļ�����
		 * 
		 * �ȴ����ַ�����
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
	 * ����:��ȡһ���ı��ļ�������ȡ�����ַ���ӡ������̨��
	 */
	public static void demo03() throws IOException {
		//����һ���ܶ�ȡ�ַ����ݵ�������
		//�ڴ�����ȡ����ʱ������Ҫ��ȷ����ȡ���ļ���һ��Ҫȷ�����ļ��Ǵ��ڵ�
		//��һ����ȡ������һ���Ѵ��ڵ��ļ���
		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			System.out.println(ch);
		}
		
		//��Reader�е�reader������ȡ�ַ�
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
		 * ����ļ������ڻ��Զ�����
		 * 
		 * ����ļ�������ᱻ����
		 * 
		 * ������캯������true����ʵ�ֶ��ļ�������д��
		 */
		FileWriter fw = new FileWriter("demo.txt",true);
		/*
		 * ����Write�����е�write(String)������д�����ݡ�
		 * 
		 * ��ʵ����д�뵽����ʱ�洢��������
		 */
		fw.write("aa");
		fw.flush();
		// �ر������ر�ϵͳ��Դ���ڹر�ǰ�������flushˢ�»����е����ݵ�Ŀ�ĵء�
		fw.close();
	}
	
}
