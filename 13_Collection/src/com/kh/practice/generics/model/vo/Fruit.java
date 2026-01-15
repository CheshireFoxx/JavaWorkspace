package com.kh.practice.generics.model.vo;

public class Fruit extends Farm{
			private String name;
			
			
			public Fruit() {
				
				
			}
			
			public Fruit(String kind, String name) {
				
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			@Override
			public String toString() {
				return super.toString()+name;
			}
			
			public int hashCode() {
				
			}
			
			public boolean equals() {
				
			}
}
