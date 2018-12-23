package com.sicheng.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Test04 {

	public static void main(String[] args) throws IOException {
		demo01();
	}

	public static void demo01() throws IOException {
		FileReader fr = new FileReader("demo.txt");
		
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
		
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		
		lnr.close();
		
	}

}
