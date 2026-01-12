package com.kh.practice.book.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
			private BookDAO bd = new BookDAO();
			
			public void makeFile() {
				
			}
			
			public void fileSave(Book[] bArr) {
				try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"))){
					for(Book b : bArr) {
						if( b !=null) {
							System.out.println(b);
							
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			public Book[] fileRead() {
				return bd.fileRead();
			}
			
}
