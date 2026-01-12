package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;
import com.kh.practice.list.model.compare.AscTitle;

public class BookController {
				private List<Book> list = new ArrayList();

				public BookController() {
					list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
					list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
					list.add(new Book("대화의 기술", "강보람", "인문", 17500));
					list.add(new Book("암 정복기", "박신우", "의료", 21000));
				}
				
				public void insertBook(Book bk) {
					list.add(bk);
				}
				
				public ArrayList<Book> selectList() {
					ArrayList<Book> result = (ArrayList<Book>)list;
					return result ;
				}
				
				public ArrayList searchBook(String keyword) {
							Book b=null;
							ArrayList searchList = new ArrayList<>();
							for(int i=0;i<list.size();i++) {
								b=list.get(i);
								if(b.getTitle().contains(keyword)) {
									searchList.add(b.getTitle());
								}
							}return searchList;
				}
				
				public Book deleteBook(String title, String author) {
							Book removeBook = null;
								for(int i=0;i<list.size();i++) {
								Book b = list.get(i);
								if(b.getTitle().equals(title)&&b.getAuthor().equals(author)) {
									removeBook=b;
						}
				}return removeBook;
				}
				
				
				public int ascBook() {
					
					
					
					return 1;
				}
				
				
				
				
				
				
				
}
