package com.kh.exception.controller;

import java.util.Scanner;

public class A_UncheckedException {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * UncheckedExeption 
		 *  - RuntimeExeption처럼 프로그램 실행시 발생되는 예외들이 대표적인 Unchecked 계열의 예외들이다.
		 *  - RuntimeExeption의 자식 클래스들
		 *  	1. ArrayIndexOutOfBoundsException
		 *  		- 배열의 인덱스 길이를 넘어서 참조
		 *  	2. NegativeArraySizeException
		 *  		- 배열 크기를 음수로 지정한 경우
		 *  	3. ClassCastException
		 *  		- 허용할 수 없는 형변환이 진행된 경우 발생하는 예외
		 *  		- ex) p1이 Child2 객체로 생성된 참조변수인 경우
		 *  			  (Child1)p1 등을 수행하는 경우
		 *  	4. NullPointerException
		 *  		- 참조변수가 null인 상황에서 특정 메서드 및 필드에 접근(호출)하려고 할 때 발생 =>  null.getxxx 등...
		 *  	5. ArithmeticException
		 * 			- 0으로 나누기 하면 발생
		 * 
		 * => 이러한 RuntimeExeption과 관련한 예외는 충분히 예측가능한 상황이다.
		 * 	  예외처리가 애초에 발생이 안되게끔, 대부분 조건문으로 해결이 가능하다.
		 * 	  즉, 굳이 예외처리를 (예외처리 코드들)을 할 필요가 없다.
		 * 
		 */
		
		
		public void method1() {
			// ArithmeticException
			// - 나누기 연산시 0으로 나눌 시 발생
			
			System.out.print("첫번째 정수 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 : ");
			int num2 = sc.nextInt();
		
			// 예외처리 방법 1. 조건문으로 애초에 예외가 발생하지 않게끔 처리한다.
			
//			if(num2 ==0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//			}else {
//				System.out.println("나눗셈 연산 결과 :"+num1/num2);
//				
//			}
			// 예외처리 방법 2. try.catch문으로 해결하기
			/*
			 * try + catch문
			 * 	- 예외가 발생했을 경우를 대비해서 실행할 내용을 정의해 두는 문법
			 * [표현법]
			 * try{
			 * // 예외가 발생할 수 있는 코드 
			 * 
			 * }catch(발생할 수 있는 예외 클래스){
			 *   // 해당예외가 발생시 실행할 코드
			 * 
			 * }
			 */
			
			
			try {
				// ArithmeticException 발생할 수 있는 코드
				System.out.println("나눗셈 연산 결과 : "+(num1/num2));
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				e.printStackTrace(); // 오류를 로그로 추적하는 기능
			}
			
			
			System.out.println("프로그램 종료");
	
		}
		
		
		
		public void method2() {
			System.out.println("정수 입력(0 제외) : ");
			
			// 예외처리 방법 1. 다중 catch 블럭
//			try {				
//				int num=sc.nextInt();
//				System.out.println("나눗셈 연산 결과 : "+(10/num));
//			}catch(ArithmeticException e){
//					System.out.println("0으로 나눌 수 없습니다.");
//				}catch(InputMismatchException i) {
//					System.out.println("정수를 제대로 입력하세요");
//				}
//			System.out.println("프로그램 종료");
			
			}		
		
		
		public void method3() {
			 // ArrayIndexOutOfBoundsException
			 // NegativeArraySizeException
			
			System.out.print("배열의 크기 : ");
			int size=sc.nextInt();
			
			
			
			// 처리방법 2. 다형성을 이용한 catch
			try {
			int [] arr =new int[size];
			System.out.println("100번째 인덱스의 값 : "+arr[100]);
			
			// 다중 catch블럭 작성 시 범위가 작은 자식 클래스를 먼저 기술해야한다. => 런타임 먼저 실행하면 아래 자식 클래스는 실행 안됨
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("잘못된 인덱스 접근입니다.");
			
			}catch(RuntimeException r) { // 상위 예외를 변수로 삼아서 하위 변수를 모두 처리
				System.out.println("예외가 발생했습니다."); // 정확히 어떤 예외가 발생했는지 파악할 수 없다.
				r.printStackTrace();
			}
			
			
		
		}
		
		
		/*
		 * RuntimeException 관련된 예외는 (unchecked. 즉, 예외처리 비권장)
		 *  - 조건문으로 해결이 가능하기 때문에 예외 자체가 애초에 발생 안되게끔 개발자가 소스코드로
		 *    핸들링하는게 권장된다.
		 *  - 예외처리 구문으로도 해결이 가능하긴 하다.
		 *  
		 *예측이 가능한 상황 => 조건문으로 해결
		 *예측이 불가능한 상황 => 예외처리 구문으로 해결
		 * 
		 * 
		 */
		
		

		
		
}
