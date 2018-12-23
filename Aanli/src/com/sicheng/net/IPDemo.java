package com.sicheng.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {
		
		// 获取本机ip地址对象
		InetAddress ip = InetAddress.getLocalHost();
		
		// 获取其它主机ip地址对象
		ip = InetAddress.getByName("www.baidu.com");
		
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
		
	}
	
}
