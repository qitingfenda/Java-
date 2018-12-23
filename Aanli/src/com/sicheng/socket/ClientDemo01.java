package com.sicheng.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo01 {

	public static void main(String[] args) throws IOException {
		// �ͻ��˷����ݵ������
		
		/*
		 * TCP���䣬�ͻ��˽����Ĺ���
		 * 1.����TCP�ͻ���socket����ʹ�õ���Socket����
		 * 		����ö���һ��������ȷĿ�ĵأ�Ҫ���ӵ�����
		 * 2.������ӽ����ɹ���˵�����ݴ���ͨ���ѽ���
		 * 		��ͨ������socket�����ǵسǽ����õģ���Ȼ������˵������������룬�������롣
		 * 		��Ҫ���������������󣬿�����Socket��������ȡ��
		 * 3.ʹ���������������д����
		 * 4.�ر���Դ��
		 */
		// �����ͻ���socket����
		Socket socket = new Socket("192.168.1.143", 8888);
		
		String ip = socket.getInetAddress().getHostAddress();
		
		System.out.println(ip+":�ͻ�������...");
		
		// ��ȡsocket���е��������
		OutputStream out = socket.getOutputStream();
		
		// ʹ���������ָ��������д��ȥ
		out.write("��� hello".getBytes());
		
		// �ر���Դ
		socket.close();
	}
	
}
