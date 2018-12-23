package com.sicheng.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo02 {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(8888);

		System.out.println("服务端启动...");

		Socket socket = serverSocket.accept();

		String ip = socket.getInetAddress().getHostAddress();

		InputStream in = socket.getInputStream();

		byte[] buf = new byte[1024];

		int len = in.read(buf);

		String text = new String(buf, 0, len);

		System.out.println(ip + ":" + text);

		// 给客户端返回信息
		OutputStream out = socket.getOutputStream();

		out.write("你好我是服务端！".getBytes());

		socket.close();

		serverSocket.close();
	}

}
