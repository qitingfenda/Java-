package com.sicheng.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * 自定义的读取缓冲区。模拟一个BufferedReader
 * 
 * 分析:
 * 缓冲区中无非就是封装了一个数组
 * 并对外提供了更多的方法对数组进行访问
 * 其实这些方法最终操作的都是数据的角标
 * 
 * 缓冲的原理:
 * 其实就是从源中获取议一批数据装进缓冲区中
 * 再从缓冲区中不断的取出一个一个数据
 * 
 * 在此次取完后，再从源中继续取一批数据进缓冲区
 * 当源中的数据取光时，用-1作为结束标记
 */

public class MyBufferedReader {

	private Reader fr;
	
	//定义一个数据作为缓冲区
	private char[] buf = new char[1024];
	
	//定义一个指针用于操作这个数据中的元素，当操作到最后一个元素后，指针应该归零
	private int pos = 0;
	
	//定义一个计数器用于记录缓冲区中的数据个数，当数据减到0，就从源中继续获取数据到缓冲区中
	private int count = 0;
	
	public MyBufferedReader(FileReader fr){
		this.fr = fr;
	}
	
	public int myRead() throws IOException{
		//1.从源中获取一批数据到缓冲区中，需要先判断，只有计数器为0时，才需要从源中获取数据
		
		if(count == 0) {
			count = fr.read(buf);
			pos = 0;
		}
		if(count < 0) {
			return -1;
		}
		
		char ch = buf[pos++];
		count --;
		
		return ch;
		
	}
	
	public String myReadLine() throws IOException {
		
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		while((ch = myRead()) != -1) {
			// 读到的字符存储到缓冲行数据的缓冲区中
			if(ch == '\r') {
				continue;
			}
			if(ch == '\n') {
				return sb.toString();
			}
			sb.append((char)ch);
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}
	
	public void myclose() throws IOException {
		fr.close();
	}
	
}
