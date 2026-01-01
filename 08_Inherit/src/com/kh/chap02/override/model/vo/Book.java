package com.kh.chap02.override.model.vo;

public class Book {
		
	private String title;
	private String author;
	private int price;
	
	public Book() {
		
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	// 메서드 오버라이딩
	/*
	 *  오버라이딩
	 *  - 상속받고 있는 부모 클래스의 메서드를 자식 클래스에서 재정의 하는것
	 *  - 부모가 제공하고 있는 메서드를 자식이 일부 고쳐 사용하겠다는 의미로, "자식 메서드가 우선권"을 가진다.
	 *  
	 *  오버라이딩 성립 조건
	 *  - 부모 메서드의 메서드 명과 동일해야한다.
	 *  - 매개변수의 자료형, 개수, 순서도 모두 동일해야한다.
	 *  - 반환형도 동일해야한다.
	 *  - 부모 메서드의 접근 제한자보다 공유 범위가 더 크거나 같아야한다.
	 *  
	 *  @Override 어노테이션
	 *  - 생략 가능
	 *  - 잘못된 조건으로 오버라이드한 경우 오류를 통해 잘못됨을 알게 하기 위해서.
	 *  - 이 메서드가 오버라이딩된 메서드라는것을 알리기 위한 목적으로.
	 */
	
	
	@Override
	public String toString() {
		return title+", "+author+", "+price;
		
		/*
		 * 출력문 안에 참조 변수를 제시하여 출력하는 경우, 내부적으로 항상
		 * toString() 메서드가 호출되며 그 결과값이 출력된다.
		 * 
		 * toString() 메서드는 부모클래스인 Object클래스에 존재하며
		 * 풀 클래스명 +@+주소값을 문자열로 반환하는 메서드이다.
		 * 
		 * 이 메서드를 오버라이딩 하면, 참조 변수를 제시하는 것 만으로 객체 내부의 값들을
		 * 한번에 출력문으로 받아볼 수 있다.
		 * 
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
