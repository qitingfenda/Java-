package com.sicheng.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo01 {

	public static void main(String[] args) throws IOException {
		// 客户端发数据到服务端
		
		/*
		 * TCP传输，客户端建立的过程
		 * 1.创建TCP客户端socket服务，使用的是Socket对象
		 * 		建议该对象一创建就明确目的地，要连接的主机
		 * 2.如果连接建立成功，说明数据传输通道已建立
		 * 		该通道就是socket流，是地城建立好的，既然是流，说明这里既有输入，又有输入。
		 * 		想要输入或者输出流对象，可以找Socket对象来获取。
		 * 3.使用输出流，将数据写出。
		 * 4.关闭资源。
		 */
		// 创建客户端socket服务
		Socket socket = new Socket("192.168.1.143", 8888);
		
		String ip = socket.getInetAddress().getHostAddress();
		
		System.out.println(ip+":客户端启动...");
		
		// 获取socket流中的输出流。
		OutputStream out = socket.getOutputStream();
		
		// 使用输出流将指定的数据写出去
		out.write("你好 hello".getBytes());
		
		// 关闭资源
		socket.close();
	}
	
}
