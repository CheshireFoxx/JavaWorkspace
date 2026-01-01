package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
		private Shape s = new Shape();
		
		public double calcPerimeter(double height, double wide) {
			s.setHeight(height);
			s.setWide(wide);
			
			return ((wide*2) + (height*2));
		}
		
		public double calcArea(double height, double wide) {
			s.setHeight(height);
			s.setWide(wide);
			
			return (wide*height);
		}
		
		public void paintcolor(String color) {
			s.setColor(color);
		}
		
		public String print() {
			return "사각형"+s.information();
		}
}
