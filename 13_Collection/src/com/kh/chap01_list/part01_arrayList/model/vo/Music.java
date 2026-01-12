package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music implements Comparable {
	private String title;
	private String singer;
	
	public Music() {
		
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setArtist(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return title + ", " + singer;
	}
	
	public int hashcode() {
		return 0;
		
	}
	
	public boolean equals(Object obj) {
		return false;
		
	}
	public int compareTo(Object o) {
		/*
		 * compareTo 메서드
		 * 	- 현재(this)객체와 매개변수로 전달된 객체간의 비교를 수행하는 메서드
		 * 	- 반환값으로 양수, , 음수의 값들이 반환되도록 설정해야한다.
		 * 	- 양수 -> 자리유지
		 * 	  0 -> 자리유지
		 *    음수 -> 자리교체
		 * 
		 */
		
		
		// 내가 구현하고자 하는 정렬 조건
		// 1. 제목 기준 오름차순 정렬
		//	- 현재 객채.비교메서드(다른개체)
//		this.title.compareTo(title);
//		
//		// 2. 제목 기준 내림차순 정렬
//		//	- 다른객체.비교메섣(현재객체)
//		title.compareTo(this.title);
//		
//		// 3. 제목, 아티스트 기준 오름차순 정렬
//		if(this.title.compareTo(o.title)==0) { // 제목기준 오름차순 정렬 결과가 0인 경우	
//		this.title.compareTo(o.singer); // 아티스트 기준 정렬
		
//		if(this.title.compareTo(title)==0) {	
//			this.title.compareTo(singer);
//		}
		return ((Music)o).singer.compareTo(getSinger()) ;
		
	}

	}
