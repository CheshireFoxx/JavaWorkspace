package com.kh.variable;

public class A_variable {

		//시급과 근무시간과 근무 일수를 곱해 월급을 계산해주는 메서드
	public void printVariable() {
		System.out.println("===변수 선언 전===");
		System.out.println("시급 : 8500 ");
		System.out.println("근무시간 : 6 ");
		System.out.println("근무일수 : 5 ");
		System.out.println("김동우 :" + 8500 * 6 * 5);
		System.out.println("김동우2 :" + 8500 * 6 * 5);
		System.out.println("김동우3"
				+ " :" + 8500 * 6 * 5);
		
		int pay = 9000;
		int time = 6;
		int day = 5;
		
		
		System.out.println("김동우 :"+ pay * time * day);
		System.out.println("김동우2 :"+ pay * time * day);
		System.out.println("김동우3 :"+ pay * time * day);
	}

		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public void declareVariable() {
			/*
			 * 변수의 선언
			 * [표현법]
			 * 자료형 변수명;
			 * 
			 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 따라
			 * 		  다르게 지정하는 부분.
			 * 변수명 : 변수의 이름을 지정하는 부분.
			 * 		  담겨있는 값을 최대한 잘 표현해야 한다.
			 * 
			 * 변수명 명명규칙
			 * 1. 변수명은 "영어 소문자"로 시작하여 작성한다.
			 * 2. 낙타등 표기법을 사용한다.(camel case)
			 * ex) String serFirstName;  이어지는 단어의 첫글자를 대문자로 바꾸는 방법
			 * 
			 * 주의점
			 * 1. 변수선언은 클래스 아래 영역, 메서드 내부에서만 사용 가능
			 * 2. 같은 영역 안에서 동일한 이름의 변수명 사용 불가
			 * 3. 해당 영역 안에서 선언한 변수는 해당 영역에서만 사용 가능
			 * 
			 * 
			 */
		
			// 1. 논리형 변수
			
			boolean isTrue;
		
			// 2. 숫자형 변수
			// 2_1. 정수형
			byte bNum; //1byte; -128 ~ 127
			short sNum; // 2byte; -3만 2천 ~ 3만 2천
			int iNum; // 4byte; -> 정수 대표 자료형
			long lNum; // 8byte; 
		
			
			// 2_2. 실수형
			float fNum; //4byte 소수점 7자리까지 표현
			double dNum; // 8byte 소수점 15자리까지 표현 (대표 자료형)
			
			// 3. 문자형
			char ch; //2byte 0~65535  캐릭터의 약자. 정수형으로 보관하지만 대응하는 문자열을 저장하고 있어 문자 저장도 가능
			//기본자료형, 원시자료형 끝
			
			
			//4. 문자열(참조자료형)
			String str; //
			
			//생성된 변수에 값을 대입하는 행위를 초기화라고 한다.
			// 자바에서는 변수를 반드시 초기화 하고 사용해야한다.
			isTrue = true;
			
			bNum = 1;
			sNum = 2;
			iNum = 4;
			lNum = 8L; //대문자가 관례
			
			fNum = 4.0f;// 실수 리터럴 값을 float에 저장시 반드시 소문자 f를 추가
			dNum = 8.0;
			
			ch = 'A';
			str = "ABC";
	}
	
	
	
	
	
	public void initVariable() {
		//변수 선언과 동시에 값을 대입
		boolean isTrue = false;
		
		int longInteger = 999_999_999;  //숫자 구분을 위한 언더바, 실제로는 표기 안됨
		byte bNum = 1; // -128 ~ 127
		System.out.println(bNum);
		int iNum = 127;
		
		bNum = (byte)(iNum + 15);
		System.out.println(bNum);
		//데이터 오버플로우  (넘치는 정보를 삭제)
		
		}
	
				//상수
	public void constant() {
		
		int age = 20;
		age = 20;
		
		
		final int AGE = 20; 
		//AGE = 21;
		//상수값을 저장하고 있는 변수의 이름은 "대문자"로 작성한다.
		//USER_FIRST_NAME -> 상수의 표기법
		
		
		
	}
}











