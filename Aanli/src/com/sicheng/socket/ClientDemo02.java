package com.sicheng.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo02 {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("192.168.1.143", 8888);

		String ip = socket.getInetAddress().getHostAddress();

		System.out.println(ip + ":客户端启动...");

		OutputStream out = socket.getOutputStream();

		out.write("你好 hello".getBytes());

		// 读取服务端返回的数据
		InputStream in = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		
		String text = new String(buf, 0, len);
		
		System.out.println(text);
		
		socket.close();
	}

}
