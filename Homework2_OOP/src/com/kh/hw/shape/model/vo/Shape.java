package com.kh.hw.shape.model.vo;

public class Shape {
		
	private int type;
	private double height;
	private double wide;
	private String color = "white";
	
	
	public Shape() {
		
	}
	
	public Shape(int type, double height, double wide) {
		this.type=type;
		this.height=height;
		this.wide=wide;
		
	}
	
	
	public String information() {
		return type + ", " + height + ", " + wide + ", " + color;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
	
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWide(double wide) {
		this.wide = wide;
	}
	
	public double getWide() {
		return wide;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}


}
