package com.sicheng.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo01 {

	public static void main(String[] args) throws IOException {
		System.out.println("���Ͷ�����������");
		/*
		 * ����UDP����ķ��Ͷ�:
		 * 1.����UDP��socket����
		 * 2.��Ҫ���͵����ݷ�װ�����ݰ���
		 * 3.ͨ��UDP��socket�������ݰ����ͳ�ȥ
		 * 4.�ر�socket����
		 */
		// 1.UDP socket����ʹ��DatagramSocket����
		DatagramSocket ds = new DatagramSocket(8888);
		
		// 2.��Ҫ���͵����ݷ�װ�����ݰ���
		String str = "��ã�Hello";
		
			// ʹ��DatagramPacket�����ݷ�װ���ö������
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getByName("127.0.0.1"),10000);
		
		// 3.ͨ��UDP��socket�������ݰ����ͳ�ȥ��ʹ��send����
		ds.send(dp);
		
		// 4.�ر���Դ
		ds.close();
		
		
	}
	
	
}
