package com.kh.practice.generics.model.vo;

public class Nut extends Farm{
	private String name;

	public Nut() {
		super();
	}

	public Nut(String kind, String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return  super.toString()+name;
	}
	
	public int hashCode() {
		
	}
	
	public boolean equals() {
		
	}
}
