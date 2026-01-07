package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
		public boolean isLeapYear(int year) {

			if(year%4==0 && (year%100!=0||year%400==0)) {
				return true;
				
			}else {
				return false;
			}	
		}
			
			
		public long leapDate(Calendar c) {


			int a =c.get(Calendar.YEAR);
			
			Calendar newYear = new GregorianCalendar(2026,0,1,0,0,0);
			long num1 = newYear.getTimeInMillis();
			long num2 = c.getTimeInMillis();
			
			long diff = (num2-num1)/1000/60/60/24;
			
			// 2025년 까지의 총 날짜 => count
			// 2026년 1월 1일부터 오늘까지의 날짜 => diff
			int count=0;
			for(int i=1;i<a;i++) {
				if(isLeapYear(i)==true) {
					count+=366;
				}else {
					count+=365;
				}
			}
				return count+diff;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
