package com.sicheng.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UpLoadServer {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(8888);

		Socket socket = serverSocket.accept();

		String ip = socket.getInetAddress().getHostAddress();

		System.out.println(ip + ":已连接！");

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		BufferedWriter bw = new BufferedWriter(new FileWriter("server.txt"));

		String line = null;

		while ((line = in.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		out.println("上传成功!");

		bw.close();
		socket.close();
		serverSocket.close();

	}

}
