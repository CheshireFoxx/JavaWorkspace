package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
			private Scanner sc = new  Scanner(System.in);
			private BookController bc = new BookController();
			private Book[] bArr;
			
			public BookMenu() {
				// 파일이 없을 때 만들어주기 위해 BookController(bc)에 makeFile() 호출
				// 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입

					bArr=bc.fileRead();
				
			}
			
			public void mainMenu() {
				while(true) {
					System.out.println("1. 도서 추가 저장 : ");
					System.out.println("2. 저장 도서 출력 : ");
					System.out.println("9. 프로그램 끝내기 : ");
					System.out.print("메뉴 번호 : ");
					int menu = sc.nextInt();
					sc.nextLine();
				
					switch(menu) {
					case 1:
						fileSave();
						break;
					case 2:
						fileRead();
						break;
					case 9:
						System.out.println("프로그램을 종료합니다.");
						return;
					default:
						System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주십시오.");
						break;
					}
				}
			}
			
			public void fileSave() {
				System.out.print("도서 명 : ");
				String title = sc.nextLine();
				System.out.print("저자 명 : ");
				String author = sc.next();
				System.out.print("도서 가격 : ");
				int price = sc.nextInt();
				
				System.out.print("출판 날짜(yyyy-mm-dd) : ");
				String date=sc.next();
				String[] arr = date.split("-");
				Calendar cal = Calendar.getInstance();
				cal.set(Integer.parseInt(arr[0]), Integer.parseInt(arr[1], Integer.parseInt(arr[2])));
				
				System.out.print("할인율 : ");
				double discountRate = sc.nextDouble();
				
				Book b = new Book(title, author, price, cal, discountRate);
				for(int i=0; i<bArr.length;i++) {
					if(bArr[i]==null) {
						bArr[i]=b;
						break;
					}
				}
			}
			
			public void fileRead() {
				
			}
			
}
