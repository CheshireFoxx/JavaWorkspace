package com.kh.chap04_date.run;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateRun {
				public static void main(String[] args) {
					//test1(); // 아래가 public void면 생성시점이 다름-> static이 아니면 메서드는 객체를 생성해야 메모리에 저장됨
					//test2();
					//test3();
					//test4();
					test5();
				}
				
				
				
				
				/*
				 *  Calendar
				 *   - 날짜와 시간에 대한 데이터를 처리하는 "추상 클래스"
				 *   	
				 */
				public static void test1() {
				
				// 현재 날짜와 시간정보 조회
				Calendar cal1 = new GregorianCalendar(); // 다형성으로 자식 클래스 저장
				Calendar cal2 = Calendar.getInstance(); // 지역정보 얻어와서 달력 생성
				
				System.out.println(cal1);
				
				// 현재 년/월/일 조회
				
				System.out.println(cal1.get(Calendar.YEAR));
				System.out.println(cal1.get(Calendar.MONTH+1)); // "월"만 0부터 센다.
				System.out.println(cal1.get(Calendar.DATE));
				
				
				// 시/분/초
				System.out.println(cal1.get(Calendar.HOUR));
				System.out.println(cal1.get(Calendar.HOUR_OF_DAY));
				System.out.println(cal1.get(Calendar.MINUTE));
				System.out.println(cal1.get(Calendar.SECOND));
				
				printCalendar(cal1);
		}
				public static void test2() {
				
				// 특정 일 특정 시간으로 초기화된 Calendar 객체 생성하기
					
				Calendar cal1 = Calendar.getInstance();
				// 2027년 1월 1일 0시 0분 0초
				
				cal1.set(2027, 0, 1, 0, 0, 0);		
				printCalendar(cal1);
					
					
				Calendar cal2 = new GregorianCalendar(2027,1,1,0,0,0);
				printCalendar(cal2);
				
				// 날짜 차이 계산하기
				Calendar now = Calendar.getInstance();
				Calendar dDay = new GregorianCalendar(2026,0,27);
				
				// 각 캘린더 객체를 밀리초로 변환하여 차이를 구한다.
				long num1 = now.getTimeInMillis(); // 1976년 1월 1일부터 - 현재시간까지 흐른 밀리초
				long num2 = dDay.getTimeInMillis();
				
				long diff = (num2 -num1)/1000/ 60 /60/24;
				System.out.println(diff);
				System.out.println("시험 날까지 D-"+(diff+1)+"일 남았습니다.");
				
				}
				
				/*
				 * java.util.Date 클래스
				 *  - 날짜와 시간에 대한 정보를 담을 수 있는 클래스
				 *  - 자바 개발 초창기에 급하게 만들어자니 클래스라 완성도가 높지 않다.
				 * 
				 */
				
				public static void test3() {
				
				// 기본 생성자를 통해 Date 객체 생성하기
				// - 현재 날짜 및 시간을 가지고 생성
				Date today = new Date();
				System.out.println("기본 생성자 : "+today);
				
				
				// 내가 원하는 날짜(2004/12/12)로 초기화
				// 방법 1. 년월일 생성자를 이용
				// 내부적으로 내가 전달한 년도 + 1900
				Date date1 = new Date(2004-1900,11, 12,0,0,0); // 다음 업데이트에서 삭제되거나 위험하니 사용하지 말라는 경고
				System.out.println("매개변수 생성자 : "+date1);
				
				// 방법 2. 밀리세컨즈를 매개변수로 받는 생성자를 이용하기
				Calendar cal2 = new GregorianCalendar(2025,5,19);
				long m = cal2.getTimeInMillis();
				Date date2 = new Date(m);
				System.out.println("밀리세컨즈 생성자 : "+date2);
				}
				
				/*
				 * java.text.SimpleDateFormat();
				 */
				public static void test4() {
				
				// "xxxx년 xx월 xx일 xx시 xx분 xx초"
				// SimpleDateFormat 객체생성
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
				// sdf.format(Date객체) : 문자열반환
				// - 포맷대로 저장된 문자열 반환
				String formatDate = sdf.format(new Date());
				System.out.println(formatDate);
	
				}
				
				/*
				 *  번외) 숫자값 형식 지정
				 *  DecimalFormat
				 *  
				 *  # 해당 자리에 데이터가 없는 경우 생략시키는 형식
				 *  0 해당 자리에 데이터가 없는 경우 0으로 표시하는 형식
				 *  
				 */
				
				public static void test5() {
				
				double num = 1234567890.123;
				
				DecimalFormat df = new DecimalFormat("#,###");
				System.out.println(df.format(num));
				
				df.applyPattern("#,###.00000");
				System.out.println(df.format(num));
				
				
				
				
				
				
				}
				
				public static void printCalendar(Calendar c) {
			        System.out.printf("%d/%02d/%02d %02d:%02d:%02d%n",
			                          c.get(Calendar.YEAR),
			                          c.get(Calendar.MONTH) + 1,
			                          c.get(Calendar.DATE),
			                          c.get(Calendar.HOUR_OF_DAY),
			                          c.get(Calendar.MINUTE),
			                          c.get(Calendar.SECOND)
			        				);
	  }
				
				
				
				
				
				
				
				
				
}
