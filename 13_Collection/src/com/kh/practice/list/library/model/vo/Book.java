package com.kh.practice.list.library.model.vo;

import java.util.Comparator;

public class Book implements Comparator{
				private String title;
				private String author;
				private String category;
				private int price;
				
				public Book() {
					super();
				}

				public Book(String title, String author, String category, int price) {
					super();
					this.title = title;
					this.author = author;
					this.category = category;
					this.price = price;
				}

				public String getTitle() {
					return title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getAuthor() {
					return author;
				}

				public void setAuthor(String author) {
					this.author = author;
				}

				public String getCategory() {
					return category;
				}

				public void setCategory(String category) {
					this.category = category;
				}

				public int getPrice() {
					return price;
				}

				public void setPrice(int price) {
					this.price = price;
				}

				@Override
				public String toString() {
					return title + ", " + author + ", " + category + ", " + price;
				}
				
				@Override
				public int hashCode() {
					return (title+author+category+price).hashCode();
					
				}
				
				@Override
				public boolean equals(Object o) {
					if(!(o instanceof  Book)) {
						return false;
					}
					
					boolean result = false;
					
					Book b = (Book) o;
					
					
					// 이름, 나이, 점수가 모두 같다면..
					if(this.title.equals(b.title)&&this.author.equals(b.author)&&this.category.equals(b.category)&&this.price==b.price) {
						result = true;
					}return result;
					
				}
				

				
				public int compareTo(Object o1, Object o2) {
					Book b1 = (Book) o1;
					Book b2 = (Book) o2;
					int result = b1.getTitle().compareTo(b2.getTitle());
					
					return result;
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
