package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
		private Scanner sc = new Scanner(System.in);
		private PersonController pc = new PersonController();
		
		public void mainMenu() {
				System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
				System.out.println("현재 저장된 학생은"+ pc.personCount() +"명입니다.");
				System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
				System.out.println("현재 저장된 사원은"+ pc.personCount() +"명입니다.");
				
				while(true) {
				System.out.println("1. 학생 메뉴");
				System.out.println("2. 사원 메뉴");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				
				switch(num) {
				case 1:
					studentMenu();
					break;
				case 2:
					employeeMenu();
					break;
				case 9:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					break;
					
				}		
			}
		}
		
		public void studentMenu() {
			
			while(true) {
			if(pc.personCount()<3) {
				System.out.println("1. 학생 추가");
				System.out.println("2. 학생 보기");
				System.out.println("9. 메인으로");
				System.out.print("메뉴 번호 : ");
				int num= sc.nextInt();
				
				switch(num) {
				case 1:
					insertStudent();
					break;
				case 2:
					printStudent();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
			}else {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에, 학생 추가메뉴는 더이상 활성화되지 않습니다.");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num= sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
			}
		}
		}
		public void employeeMenu() {
			while(true) {
				if(pc.personCount()<10) {
					System.out.println("1. 사원 추가");
					System.out.println("2. 사원 보기");
					System.out.println("9. 메인으로");
					System.out.print("메뉴 번호 : ");
					int num= sc.nextInt();
					
					switch(num) {
					case 1:
						insertEmployee();
						break;
					case 2:
						printEmployee();
						break;
					case 9:
						System.out.println("메인으로 돌아갑니다.");
						return;
					default:
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
					}
				}else {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에, 학생 추가메뉴는 더이상 활성화되지 않습니다.");
				System.out.println("2. 사원 보기");
				System.out.println("9. 메인으로");
				System.out.print("메뉴 번호 : ");
				int num= sc.nextInt();
				
				switch(num) {
				case 1:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				case 2:
					printEmployee();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				
				}
			}
		}
		
		public void insertStudent() {
					System.out.println("학생 이름 : ");
					String name = sc.next();
					System.out.println("학생 나이 : ");
					int age = sc.nextInt();
					System.out.println("학생 키 : ");
					double height = sc.nextDouble();
					System.out.println("학생 몸무게 : ");
					double weight = sc.nextDouble(); 
					System.out.println("학생 학년 : ");
					int grade = sc.nextInt(); 
					System.out.println("학생 전공 : ");
					String major = sc.next();
					
					pc.insertStudent(name, age, height, weight, grade, major);
					
					
		}
		
		public void printStudent() {
			
		}
		
		public void insertEmployee() {
			
		}
		
		public void printEmployee() {
			
		}
}
