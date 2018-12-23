package com.sicheng.socket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UpLoadClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 8888);

		BufferedReader br = new BufferedReader(new FileReader("client.txt"));

		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		String line = null;

		while ((line = br.readLine()) != null) {
			out.println(line);
		}

		socket.shutdownOutput();

		br.close();

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String text = in.readLine();

		System.out.println(text);

		socket.close();

	}

}
