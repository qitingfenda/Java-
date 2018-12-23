package com.sicheng.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TextServer {

	public static void main(String[] args) throws IOException {

		System.out.println("server begin...");

		ServerSocket serverSocket = new ServerSocket(9999);

		Socket socket = serverSocket.accept();

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		String ip = socket.getInetAddress().getHostAddress();

		String line = null;

		while ((line = in.readLine()) != null) {

			System.out.println(ip + ":" + line);

			out.println(line.toUpperCase());

		}

		socket.close();
		serverSocket.close();
		
	}

}
