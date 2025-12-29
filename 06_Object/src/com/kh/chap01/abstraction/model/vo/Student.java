package com.kh.chap01.abstraction.model.vo;
										//value object
public class Student {
		
		// 학생 관리 프로그램을 만든다고 가정
		// 학생과 관련된 속성 : 학과, 성별, 이름, 나이, 번호, 점수
		// 이름, 나이, 키 3가지 정보만 관리
		public String name;
		public int age;
		public double height;
		
		// 학생 개체가 가지는 기능
		public void study(){
			System.out.println("공부중");
		}
	
}
