package com.sicheng.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo01 {

	public static void main(String[] args) throws IOException {
		// 服务端接收客户发送过来的数据，并打印在控制台上。
		
		/*
		 * 建立TCP服务端的思路:
		 * 1.创建服务端socket服务，通过ServiceSocket对象。
		 * 2.服务端必须对外提供一个端口否则客户端无法连接。
		 * 3.获取连接过来的客户端对象。
		 * 4.通过客户端对象获取socket流读取客户端发来的数据并打印在控制台上。
		 * 5.关闭资源，关客户端，关服务端。
		 */
		
		// 创建服务端对象
		ServerSocket serverSocket = new ServerSocket(8888);
		
		System.out.println("服务端启动...");
		
		// 获取连接过来的客户端对象
		Socket socket = serverSocket.accept();// 阻塞式
		
		// 获取该用户的IP地址
		String ip = socket.getInetAddress().getHostAddress();
		
		// 通过socket对象获取输入流，尧都区客户端发来的数据
		InputStream in = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String text = new String(buf, 0, len);
		
		System.out.println(ip+":"+text);
		
		socket.close();
		
		serverSocket.close();
	}
	
}
