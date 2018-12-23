package com.sicheng.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send implements Runnable {

	private DatagramSocket ds;

	public Send(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		System.out.println("·¢ËÍ¶ËÆô¶¯£¡");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				
				byte[] buf = line.getBytes();
				
				DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.255"), 10000);
				
				ds.send(dp);
				
				if("over".equals(line)) {
					break;
				}
				
			}
			br.close();
			ds.close();
		} catch (Exception e) {
			
		}
	}

}
