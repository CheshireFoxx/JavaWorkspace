package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
		private LibraryController Lc;
		private Scanner sc;
		
		
		public void mainMenu() {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			Member mem = Member(name, age, gender);
			Lc.insertMember(mem);
			
			while(true) {
				
				System.out.println("=====메뉴=====");
				System.out.println("1. 마이페이지");
				System.out.println("2. 도서 전체 조회");
				System.out.println("3. 도서 검색");
				System.out.println("4. 도서 대여하기");
				System.out.println("9. 프로그램 종료하기");
				System.out.println("메뉴 번호 : ");
				int mNum=sc.nextInt();
				
				switch(mNum) {
				case 1:
					Lc.myinfo();
					break;
				case 2:
					Lc.selectAll();
					break;
				case 3:
					Lc.searchBook();
					break;
				case 4:
					Lc.rentBook();
					break;
				case 9 :
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.");
					break;
				}

			}
	
		}
		
		public void selectAll() {

			Book[] bList = Lc.selectAll();

			for(int i =0; i<bList.length;i++) {
				System.out.println(i+"번 도서 : "+bList[i]);
			}
		}
		
		public void searchBook() {
			System.out.print("검색할 제목 키워드 : ");
			String keyword = sc.next();
			
			
			Lc.searchBook(keyword);
			
			Book [] searchList = Lc.searchBook(keyword);
			System.out.println(searchList);
		}
		
		public void rentBook() {
			selectAll();
			System.out.print("대여할 도서 선택 : ");
			int index = sc.nextInt();
			
			Lc.rentBook(index);
			int result = Lc.rentBook(index);
			
			if(result ==0) {
				System.out.println("성공적으로 대여되었습니다.");
			}else if(result ==1) {
				System.out.println("나이 제한으로 대여 불가입니다.");
			}else if(result ==2) {
				System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			}
			
		}
		
		

		
		
}
