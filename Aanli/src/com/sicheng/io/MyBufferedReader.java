package com.sicheng.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * �Զ���Ķ�ȡ��������ģ��һ��BufferedReader
 * 
 * ����:
 * ���������޷Ǿ��Ƿ�װ��һ������
 * �������ṩ�˸���ķ�����������з���
 * ��ʵ��Щ�������ղ����Ķ������ݵĽǱ�
 * 
 * �����ԭ��:
 * ��ʵ���Ǵ�Դ�л�ȡ��һ������װ����������
 * �ٴӻ������в��ϵ�ȡ��һ��һ������
 * 
 * �ڴ˴�ȡ����ٴ�Դ�м���ȡһ�����ݽ�������
 * ��Դ�е�����ȡ��ʱ����-1��Ϊ�������
 */

public class MyBufferedReader {

	private Reader fr;
	
	//����һ��������Ϊ������
	private char[] buf = new char[1024];
	
	//����һ��ָ�����ڲ�����������е�Ԫ�أ������������һ��Ԫ�غ�ָ��Ӧ�ù���
	private int pos = 0;
	
	//����һ�����������ڼ�¼�������е����ݸ����������ݼ���0���ʹ�Դ�м�����ȡ���ݵ���������
	private int count = 0;
	
	public MyBufferedReader(FileReader fr){
		this.fr = fr;
	}
	
	public int myRead() throws IOException{
		//1.��Դ�л�ȡһ�����ݵ��������У���Ҫ���жϣ�ֻ�м�����Ϊ0ʱ������Ҫ��Դ�л�ȡ����
		
		if(count == 0) {
			count = fr.read(buf);
			pos = 0;
		}
		if(count < 0) {
			return -1;
		}
		
		char ch = buf[pos++];
		count --;
		
		return ch;
		
	}
	
	public String myReadLine() throws IOException {
		
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		while((ch = myRead()) != -1) {
			// �������ַ��洢�����������ݵĻ�������
			if(ch == '\r') {
				continue;
			}
			if(ch == '\n') {
				return sb.toString();
			}
			sb.append((char)ch);
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}
	
	public void myclose() throws IOException {
		fr.close();
	}
	
}
