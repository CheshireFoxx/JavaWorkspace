package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void practice1() {
		
			while(true) {
				System.out.print("1 이상의 숫자를 입력해주세요 : ");
				int num = sc.nextInt();
				
				if(num<1) {
					System.out.println("1 이상의 숫자를 입력해주세요. ");
					continue;		
				}else {
					for(int i =1; i<= num; i++) {
					System.out.print(i +" ");
					}
			}
				return;
		}
				
	}
	
	public void practice2() {
		while(true) {
			System.out.print("1 이상의 숫자를 입력해주세요 : ");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요. ");
				continue;		
			}else {
				for(int i =num; i > 0; i--) {
				System.out.print(i +" ");
				}
		}
			return;
	}
}
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0; 
		
		for(int i = 1; i<= num; i++ ) {
			System.out.print(i + (i!=num ? "+" : "="));
			sum+=i;
			
		}
			System.out.print(sum);
		
	}
	
	public void practice4() {
		
	 
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(!(num1 > 0 && num2 > 0)) {
			System.out.println("1 이상의 수를 입력해주세요.");
			practice4();
			return;
		}
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;
		
		for(int i= min; i<=max; i++) {
			System.out.print(i+" ");
		
		
		}
}
	
	
	
	public void practice5() {
		
		while(true) {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			continue;
		}
		for(int dan = num; dan<=9; dan++) {
			System.out.println("====="+dan+"단=====");
		for(int i=1; i<=9; i++) {
				System.out.println(dan+"X"+i+"="+(dan*i));
			}
	
		}}
	}
	
	
	public void practice6() {
		
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		//10회 반복
		for(int i = 1; i<10; i++) {
			System.out.print(num+" ");
			num += gong;
		}
		
		
		
		
	}
}