package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
			private Scanner sc = new Scanner(System.in);
			private FileController fc = new FileController();
			
			
			public void mainMenu() {
				System.out.println("***** My Note*****");
				System.out.println("1. 노트 새로 만들기");
				System.out.println("2. 노트 열기");
				System.out.println("3. 노트 열어서 수정하기");
				System.out.println("9. 끝내기");
				System.out.println("메뉴 번호 : ");
				int num = sc.nextInt();
				
				while(true) {
					
					switch(num) {
					
					case 1:
						fileSave();
						break;
					case 2:
						fileOpen();
						break;
					case 3:
						fileEdit();
						break;
					case 9:
						System.out.println("프로그램을 종료합니다.");
						return;
					default:
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
					}
		
				}
		
			}
			
			public void fileSave() {
				StringBuilder sb = new StringBuilder();
				
				while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");		
				System.out.println("내용 : ");
				String str = sc.next();
				
				sb.append(str+"\n");
				if(str.equals("ex끝it")) {
				break;
				}return;
				}
				
				while(true) {
				System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
				String fName = sc.next();
				
				boolean b=fc.checkName(fName);
				if(b) {
					System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
					char ch = sc.next().toUpperCase().charAt(0);
				
					if(ch=='N'){
						continue;
					}else if(ch=='Y') {
						fc.fileSave(fName, sb);
						break;
					}
				}
				
				fc.fileSave(fName, sb);
	
				}
}
			
			public void fileOpen() {
				
			}
			
			public void fileEdit() {
				
			}
}
