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
	
	public void practice7() {
		
		while(true) {
			System.out.print("연산자 (+,-,*,/,%) : ");
			String str = sc.next();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			if(!(str.equals("+") || str.equals("-")||str.equals("*")||str.equals("/")||str.equals("%"))) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 2 : ");
			int num2 = sc.nextInt();
			int result = 0;
			
			
			
			if(str.equals("/")&&num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			
			
				switch(str) {
				case "+" :
					result = num1 + num2;
					break;
				case "-" :
					result = num1-num2;
					break;
				case "*" :
					result = num1*num2;
					break;
				case "/" :
					result = num1/num2;
					break;
				case "%" :
					result = num1%num2;
					break;
				}
				System.out.println(num1+str+num2+"="+result);

			
			
				}
		
		
		}
	
		public void practice8 () {
			System.out.print("정수 입력: " );
			int num = sc.nextInt();
			
			for (int i =1; i<=num; i++) {
				for (int j =1; j<=i; j++) {
				System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		public void practice9 () {
			System.out.print("정수 입력: " );
			int num = sc.nextInt();
			
			for (int i =1; i<=num; i++) {
				for (int j =num; j>=i; j--) {
				System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void practice10() {
			
			
			//숫자 입력 받기
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			//숫자가 2보다 작으면 잘못 입력하셨습니다
			if(num<2) {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
			
			//소수인지 판별
			for (int i =2; i<num; i++) {
				if(num%i==0) {
					System.out.println("소수가 아닙니다.");
					return;
				}
				
			}
			System.out.println("소수입니다.");

			}
		
		
		
		public void practice11() {
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			
			int count = 0;
			for (int i =2; i<=num; i++) {
				boolean isPrime = true;
				for(int j = 2; j<i-1; j++) {
					if(i%j==0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
				count++;
				System.out.print(i +" ");
				}
			}
			System.out.println();
			System.out.println("2부터 "+num+"까지 소수의 개수는 "+count+"개 입니다.");
		}
		
		public void practice12() {
			System.out.print("자연수 하나를 입력해 주세요 : ");
			int num = sc.nextInt();
			
			int count = 0;
			for(int i=1; i<=num; i++) {
					if(i%2==0 || i%3==0 ) {
					System.out.print(i+" ");
			}
					if(i%2==0 && i%3==0) {
					count++;
					}
			}
			System.out.println();
			System.out.println("count : "+count);
		}
		
		
}



			