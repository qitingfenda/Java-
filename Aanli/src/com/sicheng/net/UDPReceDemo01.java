package com.sicheng.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceDemo01 {

	public static void main(String[] args) throws IOException {
		System.out.println("���ն�����������");
		/*
		 * ����UPD���ն˵�˼·:
		 * 1.����UDP socket������ΪҪ�������ݣ�����Ҫ��ȷһ���˿ں�
		 * 2.�������ݰ������ڴ洢���յ������ݣ����������ݰ�����ķ���������Щ����
		 * 3.ʹ��socket�����receive���������յ����ݴ洢�����ݰ���
		 * 4.ͨ�����ݰ��ķ����������ݰ��е�����
		 * 5.�ر���Դ
		 */
		
		// 1.����UDP socket����
		DatagramSocket ds = new DatagramSocket(10000);
		
		// 2.�������ݰ�
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		// 3.ʹ�ý��շ��������ݴ洢�����ݰ���
		ds.receive(dp);//����ʽ��
		
		// 4.ͨ�����ݰ�����ķ������������е����ݣ�����:��ַ���˿ڣ��������ݡ�
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String text = new String(dp.getData(),0,dp.getLength());
		
		System.out.println(ip+":"+port+":"+text);
		
		// 5.�ر���Դ
		ds.close();
		
		
	}
	
	
}
