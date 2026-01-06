package com.kh.practice.chap02_abstractNIntercace.model.vo;

public abstract class SmartPhone implements Cellphone, TouchDisplay{
			private String maker; // 제조사 정보
			
			
			
			public SmartPhone() {
				
			}

			public String getMaker() {
				return maker;
			}

			public void setMaker(String maker) {
				this.maker = maker;
			}
			
			public abstract String printInformation();


			
			
}
