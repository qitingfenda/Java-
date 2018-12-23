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
	 * 计算两个日期之间相隔的天数
	 * 2018-5-25到2018-6-03
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
	 * 将日期格式的字符串-->日期对象
	 * 使用的时DateFormat类中的
	 */
	public static void demo04() throws ParseException {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		
		dateFormat = new SimpleDateFormat("yyyy---MM---dd");
		
		String dateStr = "2018---5---5";
		
		Date date = dateFormat.parse(dateStr);
		
		System.out.println(date);
	}

	/*
	 * 将日期格式转换成自定义格式
	 */
	public static void demo03() {
		Date date = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy--MM--dd");
		
		String dateStr = simpleDateFormat.format(date);
		
		System.out.println(dateStr);
		
	}


	/*
	 * DateFormat获取时间格式对象，具有着默认的风格。
	 * FULL LONG 等可以指定风格
	 */
	public static void demo02() {
		Date date = new Date();
		
		//获取年月日
		DateFormat dateFormat = DateFormat.getDateInstance();
		//获取年月日时分秒
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
