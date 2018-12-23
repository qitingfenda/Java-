package com.sicheng.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TextCilent {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 9999);

		String ip = socket.getInetAddress().getHostAddress();

		System.out.println(ip + ":begin...");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String line = null;

		while ((line = br.readLine()) != null) {

			if ("over".equals(line)) {
				System.out.println("ÍË³ö£¡£¡£¡£¡£¡£¡");
				break;
			}

			out.println(line);

			String text = in.readLine();

			System.out.println("server:" + text);
		}

		socket.close();
	}

}
