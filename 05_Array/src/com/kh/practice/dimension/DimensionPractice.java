package com.kh.practice.dimension;


public class DimensionPractice {
	
	
	public void practice1() {
		String [][] arr = new String [3][3];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("("+i+","+j+")"+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public void practice2() {
		int [][] arr = new int [4][4];
		
		int value=1;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(value+++" ");
		}
			System.out.println();
		}
	}
	
	public void practice3() {
		int [][] arr = new int [4][4];
		
		int value= 16;
		for(int i=arr.length; i>0;i--) {
			for(int j=arr.length; j>0;j--) {
				System.out.print(value--+" ");
		}
			System.out.println();
	
		}
	}
	
	public void practice4 () {
		int [][] arr= new int [4][4];
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				
				int value = (int)(Math.random()*10+1);
				sum += value;
				System.out.print(value + " "+sum);

		}System.out.println();
	}
	}	
	
	
	
	
}


















