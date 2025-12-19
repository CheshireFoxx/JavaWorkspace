package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
		public void practice1() {
			System.out.print("인원 수 : ");
			int man = sc.nextInt();
			System.out.print("사탕 개수 : ");
			int candy = sc.nextInt();
			
			
			System.out.println("1인당 사탕 개수 : " + (candy/man));
			System.out.println("남는 사탕 개수 : " + (candy%man));
			
		}
		
		
		
		
		public void practice2() {
			
			//이거 조건 더 걸어서 바꿔야할듯
			//숫자만 뽑아내는 법과 성별 대소문자 둘다 가능하게 하는법 연구하기
			
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("학년(숫자만) : ");
			int grade = sc.nextInt();
			System.out.print("반(숫자만) : ");
			int cls = sc.nextInt();
			System.out.print("번호(숫자만) : ");
			int num = sc.nextInt();
			System.out.print("성별(M/F) : ");
			char sex = sc.next().charAt(0);
			System.out.print("성적(소수점 아래 둘째 자리까지) : ");
			double test = sc.nextDouble();
			
			//boolean male = sex =="M" || sex == "m";
			//boolean female = sex == "F" || sex == "f";
			//String 성별 = sex == "M" ? "남학생" : "여학생";
			//boolean 성별 = sex == "M" ? true : false;
			System.out.println(grade+"학년 "+cls+"반 "+num+"번 "+name+(sex == 'M'?"남학생":"여학생")+"의 성적은 "+test+"이다.");
			
		}
		
		
		public void practice3() {
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			String result = age > 19 ? "성인" : (age <= 13 ? "어린이" : "청소년");
			
			System.out.println(result);
			
		}
		
		
		public void practice4() {
			
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			
			int total = kor+eng+math;
			double avg = total/3.0;
			System.out.print("합계 : " + total);
			System.out.print("수학 : " + avg);
			
			String pass = (kor >= 40) && (eng >= 40) && (math >= 40) && (total >= 60) ? "합격" : "불합격";
			System.out.println(pass);
		}
		
		public void practice5() {
			
			System.out.print("주민번호를 입력해주세요(-포함) : ");
			String num = sc.next();
			char ch = num.charAt(7);
			
			String sex = ch%2 == 0 ? "여자" : "남자";
			System.out.println(sex);
		}
		
		
		
		public void practice6() {
			
			
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			System.out.print("입력 : ");
			int num3 = sc.nextInt();
			
			boolean result = num3<num1 || num3 > num2; 
					System.out.println(result);
			
		}
		
		public void practice7() {
			
			System.out.print("입력1 : ");
			int num1 = sc.nextInt();
			System.out.print("입력2 : ");
			int num2 = sc.nextInt();
			System.out.print("입력2 : ");
			int num3 = sc.nextInt();
			
			boolean result = num1 == num2 && num2 == num3;
			System.out.println(result);
		}
		
		public void practice8() {
			
			System.out.print("A사원의 연봉 : ");
			int 연봉a = sc.nextInt();
			System.out.print("B사원의 연봉 : ");
			int 연봉b = sc.nextInt();
			System.out.print("C사원의 연봉 : ");
			int 연봉c = sc.nextInt();
			
			
			double 인센a = 연봉a * 0.4;
			double 인센b = 0;
			float 인센c = (float)(연봉c * 0.15);
			
			double 급여a = 연봉a + 인센a;
			double 급여b = 연봉b + 인센b;
			float 급여c = (float)(연봉c + 인센c);
					
			System.out.println("A사원 연봉/연봉 +a :" + 연봉a + "/" + 급여a);
			//boolean result = 급여a > 3000 ? true : false ;
			//System.out.println(result ? "3000 이상" : "3000 미만");
			
			//아래처럼 하는게 더 효율적일듯?
			String result = 급여a > 3000 ? "3000 이상" : "3000 미만";
			System.out.println(result);
			
			System.out.println("B사원 연봉/연봉 +a :" + 연봉b + "/" + 급여b);
			boolean result2 = 급여b > 3000 ? true : false ;
			System.out.println(result2 ? "3000 이상" : "3000 미만");
			
			System.out.println("C사원 연봉/연봉 +a :" + 연봉c + "/" + 급여c);
			boolean result3 = 급여c > 3000 ? true : false ;
			System.out.println(result3 ? "3000 이상" : "3000 미만");
			
		}
		
		
		
}
