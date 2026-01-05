package com.kh.chap01_poly.part01.model.vo;

public class Child02 extends Parent {
		public Child02() {
			
		}

		public Child02(int x, int y) {
			super(x, y);
			
		}
		
		public void printChild02() {
			System.out.println("Child02 메서드");
		}
		
		public void print() {
			System.out.println("오버라이딩 한 자식 메서드02");
		}
		
		
}
