package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	Scanner sc = new Scanner(System.in);
	
	public void practice2() {
		
		
		
		System.out.print("첫번째 정수 : ");
		int iNum = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int iNum2 = sc.nextInt();
		
		System.out.println("더하기 결과 : "+ (iNum + iNum2));
		System.out.println("빼기 결과 : "+ (iNum - iNum2));
		System.out.println("곱하기 결과 : "+ iNum * iNum2);
		System.out.println("나누기 결과 : "+ iNum/iNum2);
		
		
		
	}
	
		
}
