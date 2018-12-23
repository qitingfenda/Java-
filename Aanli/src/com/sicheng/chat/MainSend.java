package com.sicheng.chat;

import java.io.IOException;
import java.net.DatagramSocket;

public class MainSend {

	public static void main(String[] args) throws IOException {

		DatagramSocket send = new DatagramSocket();

		new Thread(new Send(send)).start();
	}

}
