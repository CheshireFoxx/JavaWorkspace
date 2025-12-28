package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
		
		Scanner sc = new Scanner(System.in);
		
		public void rps () {
			
			
			int 승리 = 0;
			int 무승부 = 0;
			int 패배 = 0;
			int 전투 = 0;
			
			System.out.print("당신의 이름을 입력해 주세요 : ");
			String name = sc.next();
			
			while(true)
			{
				System.out.println();
				System.out.print("가위바위보 : ");
				String 입력 = sc.next();
				
				if(!(입력.equals("가위")||입력.equals("바위")||입력.equals("보자기")||입력.equals("exit"))) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
				if(입력.equals("exit")) {
					break;
				}
				
				int random = (int)(Math.random()*3+1);
				String com = "";
				switch(random) {
				case 1 :
					 com = "가위";
					break;
				case 2 :
					 com = "바위";
					break;
				case 3 :
					 com = "보자기";
					break;
				}
				
				
				System.out.println("컴퓨터 : "+com);
				System.out.println(name+" : "+입력);
				
				if(입력.equals(com)) {
					System.out.println("비겼습니다.");
					무승부++;
					전투++;
					continue;
					}
				if(입력.equals("가위")) {
					if(com.equals("바위")) {
						System.out.println("졌습니다.");
						패배++;
						전투++;
						continue;
					}else {
						System.out.println("이겼습니다.");
						승리++;
						전투++;
						continue;
						
					}
				}
				
				if(입력.equals("보자기")) {
					if(com.equals("가위")) {
						System.out.println("졌습니다.");
						패배++;
						전투++;
						continue;
					}else {
						System.out.println("이겼습니다.");
						승리++;
						전투++;
						continue;
						
					}
				}
				
				if(입력.equals("바위")) {
					if(com.equals("보자기")) {
						System.out.println("졌습니다.");
						패배++;
						전투++;
						continue;
					}else {
						System.out.println("이겼습니다.");
						승리++;
						전투++;
						continue;
				
					}
				}
				
				
				}
			System.out.println(전투+"전 "+승리+"승 "+무승부+"무 "+패배+"패");
			
		}
}
