package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
		Scanner sc = new Scanner(System.in);
	public void upDown() {
		
		int random = (int)(Math.random()*100+1);
		int count = 0;
		
		System.out.println(random);
		
		
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();
			
			if(!(num>0&&num<=100)) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				continue;
			}
			if(num>0&&num<=100&&num<random) {
				System.out.println("UP !");
				count++;
				continue;
			}
			
			if(num>0&&num<=100&&num>random) {
				System.out.println("DOWN !");
				count++;
				continue;
			}
			
			if(num>0&&num<=100&&num == random) {
				System.out.println("정답입니다 !!");
				count++;
				break;
			}
			
		}
		
		System.out.println(count+"회 만에 맞추셨습니다.");
		
	}
}
