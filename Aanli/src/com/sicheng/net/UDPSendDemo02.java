package com.sicheng.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo02 {

	public static void main(String[] args) throws IOException {
		System.out.println("·¢ËÍ¶ËÆô¶¯¡£¡£¡£");
		DatagramSocket ds = new DatagramSocket(8888);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		while ((line = br.readLine()) != null) {
			byte[] buf = line.getBytes();

			DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);

			ds.send(dp);

			if ("over".equals(line)) {
				break;
			}
		}
		br.close();
		ds.close();
	}
}
