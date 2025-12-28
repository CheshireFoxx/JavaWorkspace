package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);

	public void method1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("매뉴번호를 입력하세요 : ");
		int menu = sc.nextInt();

		if (menu == 7) {
			System.out.println("프로그램 종료");
			return;
		}

		switch (menu) {
		case 1:
			System.out.print("입력");
			break;
		case 2:
			System.out.print("수정");
			break;
		case 3:
			System.out.print("조회");
			break;
		case 4:
			System.out.print("삭제");
			break;
		// case 7 :
		// System.out.println("프로그램이 종료됩니다.");
		// return;
		// 메서드 내 어디서든 사용가능
		// 현재 위치에서 메서드를 "종료"시키는 키워드
		// break;
		}
		System.out.println(" 메뉴입니다.");
	}

	public void method2() {
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();

		// 양수인지아닌지
		// 가드조건문
		// - 조건을 만족하지 않으면 즉시 종료하는 패턴
		if (!(num > 0)) {
			System.out.println("양수만 입력하세요");
			return;
		}
		// 홀수인지 짝수인지
		if (num % 2 == 1) {
			System.out.println("홀수임다");
		} else {
			System.out.println("짝수임다");
		}

		// 중첩 if문 구조
		if (!(num > 0)) {
			System.out.println("양수만 입력해주세요.");
			return;
		}

		if (num % 2 == 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
	}

	public void method3() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3.0;

		if (!(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60)) {
			System.out.println("불합격 입니다.ㅠ");
			return;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("축하합니다, 합격입니다!");
	}

	public void method4() {
		System.out.print("1 ~ 12사이의 정수 입력 : ");
		int num = sc.nextInt();

		String season = "";
		switch (num) {
		case 1, 2, 12:
			season = "겨울";
			break;
		case 3, 4, 5:
			season = "봄";
			break;
		case 6, 7, 8:
			season = "여름";
			break;
		case 9, 10, 11:
			season = "가을";
			break;
		default:
			season = "잘못 입력된 달";
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			return;
		}
		System.out.println(num + "월은 " + season + "입니다.");
	}

	public void method5() {
		String realId = "minmin";
		String realPwd = "Min1234";

		System.out.print("아이디 : ");
		String id = sc.next();

		System.out.print("비밀번호 : ");
		String pwd = sc.next();

//		if(id.equals(realId) && pwd.equals(realPwd)) {
//			System.out.println("로그인 성공");
//			return;
//		}

		if (!id.equals(realId)) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}

		if (!pwd.equals(realPwd)) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}

		System.out.println("로그인 성공");
	}

	public void method6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String id = sc.next();

		String 관리 = "회원관리, 게시글 관리 ";
		String 작성 = "게시글 작성, 댓글 작성 ";
		String 조회 = "게시글 조회 ";
		String 권한 = " ";
		switch (id) {
		case "관리자":
			권한 = 관리 + 작성 + 조회;
			break;
		case "회원":
			권한 = 작성 + 조회;
			break;
		case "비회원":
			권한 = 조회;
			break;
		}
		System.out.println(권한);
	}

	public void method7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double num = sc.nextDouble();
		System.out.print("몸무게(kg)을 입력해주세요 : ");
		double num2 = sc.nextDouble();

		float bmi = (float) (num2 / (num * num));

		System.out.println("BMI 지수 : " + bmi);
		String result = bmi >= 30 ? "고도비만" : (bmi >= 25 ? "비만" : (bmi >= 23 ? "과체중" : (bmi >= 18.5 ? "정상체중" : "저체중")));
		System.out.println(result);
		return;

	}

	public void method8() {
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String str = sc.next();

		float result = 0;

		if (num1 > 0 && num2 > 0) {
			if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%")) {
				switch (str) {
				case "+":
					result = (float) num1 + num2;
					break;
				case "-":
					result = (float) num1 - num2;
					break;
				case "*":
					result = (float) num1 * num2;
					break;
				case "/":
					result = (float) num1 / num2;
					break;
				case "%":
					result = (float) num1 % num2;
					break;
				}
				System.out.println(num1 + str + num2 + "=" + result);
			} else {

				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
	}

	public void method9() {
		System.out.print("중간 고사 점수 : ");
		int 중간 = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int 기말 = sc.nextInt();
		System.out.print("과제 점수 : ");
		int 과제 = sc.nextInt();
		System.out.print("출석 회수 : ");
		int 출석 = sc.nextInt();

		double 중간평가 = 중간 * 0.2;
		double 기말평가 = 기말 * 0.3;
		double 과제평가 = 과제 * 0.3;
		double 출석점수 = (double) 출석;
		double 점수 = 중간평가 + 기말평가 + 과제평가;
		String 점수평가 = 점수 + 출석 >= 70 ? "Pass" : "Fail";
		String 출석률 = 100 - (출석 * 5) <= 30 ? "Pass" : "Fail";

		System.out.println("==========결과==========");

		if (점수평가.equals("Pass") && 출석률.equals("Pass")) {
			System.out.println("중간 고사 점수(20) : " + 중간평가);
			System.out.println("기말 고사 점수(30) : " + 기말평가);
			System.out.println("과제 점수(30) : " + 과제평가);
			System.out.println("출석 점수(20) : " + 출석점수);
			System.out.println("총점 : " + (점수 + 출석));
			System.out.println("PASS");

		} else if (출석률.equals("Fail")) {
			System.out.println("FAIL" + "[출석 회수 부족 (" + 출석 + "/20)]");
		} else if (점수평가.equals("Fail")) {
			System.out.println("FAIL" + "[점수 부족 (" + 점수평가 + "/100)]");

		}
	}

	public void method10() {

		System.out.print("실행할 메뉴를 선택학세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("선택 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			method4();
			break;
		case 5:
			method5();
			break;
		case 6:
			method6();
			break;
		case 7:
			method7();
			break;
		case 8:
			method8();
			break;
		case 9:
			method9();
			break;
		}

	}

	public void practice11() {

		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();

		if (pw < 1000 || pw > 9999) {
			System.out.println("자리수 안맞음");
		} 
		//이 아래 부분은 최적화 찾아봐야함
		else {
			int a = pw / 1000;
			int b = (pw / 100) % 10;
			int c = (pw / 10) % 10;
			int d = pw % 10;

			
			if (a == b || a == c || a == d || b == c || b == d || c == d) {
				System.out.println("실패");
			} else {
				System.out.println("성공");
			}
		}
	}

}
