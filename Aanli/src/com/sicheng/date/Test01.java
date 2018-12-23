package com.sicheng.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) throws ParseException {
		demo05();
	}
	
	/*
	 * ������������֮�����������
	 * 2018-5-25��2018-6-03
	 */
	public static void demo05() throws ParseException {
		String strDate01 = "2018-5-25";
		String strDate02 = "2018-6-03";
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date date01 = dateFormat.parse(strDate01);
		Date date02 = dateFormat.parse(strDate02);
		
		long time01 = date01.getTime();
		long time02 = date02.getTime();
		
		long time = Math.abs(time02 - time01);
		
		System.out.println(time);
		
		int day = getDay(time);
		
		System.out.println(day);
	}

	public static int getDay(long time) {
		
		long dayMillis = 1000*60*60*24;
		
		int day = (int) (time/dayMillis);
		
		return day;
	}
	
	/*
	 * �����ڸ�ʽ���ַ���-->���ڶ���
	 * ʹ�õ�ʱDateFormat���е�
	 */
	public static void demo04() throws ParseException {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		
		dateFormat = new SimpleDateFormat("yyyy---MM---dd");
		
		String dateStr = "2018---5---5";
		
		Date date = dateFormat.parse(dateStr);
		
		System.out.println(date);
	}

	/*
	 * �����ڸ�ʽת�����Զ����ʽ
	 */
	public static void demo03() {
		Date date = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy--MM--dd");
		
		String dateStr = simpleDateFormat.format(date);
		
		System.out.println(dateStr);
		
	}


	/*
	 * DateFormat��ȡʱ���ʽ���󣬾�����Ĭ�ϵķ��
	 * FULL LONG �ȿ���ָ�����
	 */
	public static void demo02() {
		Date date = new Date();
		
		//��ȡ������
		DateFormat dateFormat = DateFormat.getDateInstance();
		//��ȡ������ʱ����
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		
		String dateStr = dateFormat.format(date);
		
		System.out.println(dateStr);
		
	}

	public static void demo01() {
		long time = System.currentTimeMillis();
		Date date = new Date(time);
		System.out.println(date);
		
	}
}
