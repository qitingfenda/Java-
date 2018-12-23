package com.sicheng.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {

	/*
	 * ��Ҫ��ȡԴ ������������д�뵽Ŀ�ĵ� ��Ȼ�ǲ����ı����ݣ�ʹ���ַ���
	 */

	public static void main(String[] args) {
		demo01();
	}

	public static void demo01() {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("demo.txt");
			fw = new FileWriter("demo2.txt");
			char[] buf = new char[1024];
			int len = 0;
			while ((len = fr.read(buf)) != -1) {
				fw.write(buf, 0, len);
				fw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (fr != null) {
						try {
							fr.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
