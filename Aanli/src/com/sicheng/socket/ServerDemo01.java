package com.sicheng.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo01 {

	public static void main(String[] args) throws IOException {
		// ����˽��տͻ����͹��������ݣ�����ӡ�ڿ���̨�ϡ�
		
		/*
		 * ����TCP����˵�˼·:
		 * 1.���������socket����ͨ��ServiceSocket����
		 * 2.����˱�������ṩһ���˿ڷ���ͻ����޷����ӡ�
		 * 3.��ȡ���ӹ����Ŀͻ��˶���
		 * 4.ͨ���ͻ��˶����ȡsocket����ȡ�ͻ��˷��������ݲ���ӡ�ڿ���̨�ϡ�
		 * 5.�ر���Դ���ؿͻ��ˣ��ط���ˡ�
		 */
		
		// ��������˶���
		ServerSocket serverSocket = new ServerSocket(8888);
		
		System.out.println("���������...");
		
		// ��ȡ���ӹ����Ŀͻ��˶���
		Socket socket = serverSocket.accept();// ����ʽ
		
		// ��ȡ���û���IP��ַ
		String ip = socket.getInetAddress().getHostAddress();
		
		// ͨ��socket�����ȡ��������Ң�����ͻ��˷���������
		InputStream in = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String text = new String(buf, 0, len);
		
		System.out.println(ip+":"+text);
		
		socket.close();
		
		serverSocket.close();
	}
	
}
