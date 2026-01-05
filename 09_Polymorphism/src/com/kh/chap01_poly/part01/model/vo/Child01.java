package com.kh.chap01_poly.part01.model.vo;

public class Child01 extends Parent{
		private int z;
		
		public Child01() {
			
		}

		public Child01(int x, int y, int z) {
			super(x,y);
			this.z = z;
		}

		public int getZ() {
			return z;
		}

		public void setZ(int z) {
			this.z = z;
		}
		
		public void printChild01() {
			System.out.println("Child01 메서드");
		}
		
		public void print() {
			System.out.println("오버라이딩 한 자식 메서드01");
		}
		
}
