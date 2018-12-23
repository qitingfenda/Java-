package com.sicheng.chat;

import java.io.IOException;
import java.net.DatagramSocket;

public class MainReceive {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket receive = new DatagramSocket(10000);

		new Thread(new Receive(receive)).start();
	}

}
