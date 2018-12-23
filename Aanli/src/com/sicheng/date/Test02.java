package com.sicheng.date;

import java.util.Calendar;

public class Test02 {

	public static void main(String[] args) {
		Demo03();
	}

	public static void Demo03() {
		
		int year = 2011;
		
		int days = showTwoMothDays(year);
		
		System.out.println(days);
	}	
	
	public static int showTwoMothDays(int year) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2013, 2, 31);
		
		calendar.add(Calendar.MONTH, -1);
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		return day;
	}

	public static void Demo02() {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2018, 10, 23);
		
		calendar.add(Calendar.YEAR, -2);
		
		showDate(calendar);
	}

	public static void Demo01() {

		Calendar calendar = Calendar.getInstance();

		// System.out.println(calendar);

		showDate(calendar);

	}

	public static void showDate(Calendar calendar) {
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);

		String weekStr = getWeek(week);

		System.out.println(year + "��" + month + "��" + day + "��" + " " + weekStr);
	}

	public static String getWeek(int i) {

		String[] str = { "", "������", "����һ", "���ڶ�", "������", "������", "������", "������" };

		return str[i];
	}
}
