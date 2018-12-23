package com.sicheng.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive implements Runnable {

	private DatagramSocket ds;

	public Receive(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		System.out.println("接收端启动！");
		try {
			while (true) {
				byte[] buf = new byte[1024];

				DatagramPacket dp = new DatagramPacket(buf, buf.length);

				ds.receive(dp);

				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				String text = new String(dp.getData(), 0, dp.getLength());
				
				if("over".equals(text)) {
					System.out.println("ip为\""+ip+"\"的用户退出聊天！");
				}else {
					System.out.println(ip+":"+port+":"+text);
				}
				
			}
		} catch (Exception e) {

		}
	}

}
