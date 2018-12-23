package com.sicheng.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceDemo02 {

	public static void main(String[] args) throws IOException {
		System.out.println("Ω” ’∂À∆Ù∂Ø°£°£°£");
		DatagramSocket ds = new DatagramSocket(10000);

		while (true) {
			byte[] buf = new byte[1024];
			
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			
			ds.receive(dp);

			String ip = dp.getAddress().getHostAddress();
			
			int port = dp.getPort();
			
			String text = new String(dp.getData(), 0, dp.getLength());

			System.out.println(ip + ":" + port + ":" + text);
		}

	}

}
