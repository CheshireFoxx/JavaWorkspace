package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		
		while(true) {
		System.out.println("===== 도형 프로그램 ====="); 
		

		System.out.println("3.삼각형"); 
		

		System.out.println("4. 사각형"); 
		
		System.out.println("9. 프로그램 종료"); 
		

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(!(menuNum==3||menuNum==4||menuNum==9)) {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			continue;
		}
		switch(menuNum) {
		case 3:
			triangleMenu();
			break;
		case 4:
			squareMenu();
			break;
		case 9:
			System.out.println("프로그램 종료.");
			return;
		}
		}
	}
		public void triangleMenu(){
			
			while(true) {
		
		// ===== �ﰢ�� =====
			System.out.println("===== 삼각형 =====");

			System.out.println("1. 삼각형 면적");

			System.out.println("2. 삼각형 색칠");

			System.out.println("3. 삼각형 정보");

			System.out.println("9. 메인으로");

			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			if(!(menuNum==1||menuNum==2||menuNum==3||menuNum==9)) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
			
			switch(menuNum) {
			case 1:
				inputSize(3,1);
				break;
			case 2:
				inputSize(3,2);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				return;
			
			}
		}
		}
		
		public void squareMenu(){
			
			while(true) {
		// ===== �簢�� =====
			System.out.println("===== 사각형 =====");

			System.out.println("1. 사각형 둘레");

			System.out.println("2. 사각형 면적");

			System.out.println("3. 사각형 색칠");

			System.out.println("4. 사각형 정보");

			System.out.println("9. 메인으로");

			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			

		if(!(menuNum==1||menuNum==2||menuNum==3||menuNum==4||menuNum==9)) {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			continue;
			
		}
		
		switch(menuNum) {
		case 1:
			inputSize(4,1);
			break;
		case 2:
			inputSize(4,2);
			break;
		case 3:
			inputSize(4,3);
			break;
		case 4:
			printInformation(4);
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
			return;
		
		}
		}
		}

		public void inputSize(int type, int menuNum) {

			if(type ==3) {
				if(menuNum==1) {
					System.out.print("높이: ");
					double height = sc.nextDouble();
					
					System.out.print("너비 : ");
					double wide = sc.nextDouble();
					
					System.out.println("삼각형 면적 : "+ tc.calcArea(height, wide));
				}
				else {
					System.out.print("색깔을 입력하세요 : ");
					String color = sc.next();
					tc.paintColor(color);
					System.out.println("색이 수정되었습니다.");
				}
			}
			
			if(type == 4) {
				if(menuNum==1||menuNum==2) {
					System.out.print("높이 : ");
					double height = sc.nextDouble();
					System.out.print("너비 : ");
					double wide = sc.nextDouble();
					
					switch(menuNum) {
					case 1:
						System.out.println("사각형 둘레 : "+scr.calcPerimeter(height, wide));
						break;
					case 2 :
						System.out.println("사각형 면적 : "+scr.calcArea(height, wide));
						break;
					}						
					}
				if(menuNum==3) {
					System.out.print("색깔을 입력하세요 : ");
					String color=sc.next();
					scr.paintcolor(color);
					System.out.println("색이 수정되었습니다.");
				}
			}
			}
			public void printInformation(int type){
				if(type==3) {
					System.out.println(tc.print());
				}
				if(type==4) {
					System.out.println(scr.print());
				}
			}

}
