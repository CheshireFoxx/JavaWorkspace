package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 * CheckedException은 반드시 예외처리를 해줘야 하는 예외들을 의미한다.
	 * 주로 외부 매체와의 입출력 시 발생한다.
	 * 
	 */
	
	
	public void method1() {
		
		try {
			method2();
		}catch(IOException e) {
			System.out.println("예외발생");
		}
	}
	
	
	
	
	
	
	public void method2() throws IOException{
			
		// Scanner와 비슷한, 키보드로 값을 입력받을 수 있는 객체
		// 성능이 좋고 빨라서 실무에서 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 예외처리 방법 1. try - catch로 직접 예외 처리
//		try {
			System.out.print("아무 문자열이나 입력해 보세요 : ");
//			// readLine90 호출시 IOExpetion이 발생할 수 있으므로, 반드시 예외처리 해줘야 한다.
//			String str = br.readLine();
//			System.out.print("문자열의 길이 : "+ str.length());
//			
//		}catch(IOException e) {
//			System.out.println("예외발생");
//		}
		
		
		// 예외처리 방법 2. throws
		// 현재 메서드에서 예외를 처리하지 않고, 현재 메서드를 호출한 곳으로 위임하는 기능.
		String str = br.readLine();
		System.out.println("문자열의 길이 : "+str.length());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
