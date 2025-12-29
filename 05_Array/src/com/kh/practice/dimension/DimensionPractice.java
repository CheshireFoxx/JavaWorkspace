package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	
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
	
	public void practice4() {

	    int[][] arr = new int[4][4];

	    // 값 저장 + 행합 + 열합 + 전체합 동시 처리
	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = 0; j < arr[i].length - 1; j++) {

	            arr[i][j] = (int)(Math.random() * 10) + 1;

	            arr[i][arr[i].length - 1] += arr[i][j];      // 행 합
	            arr[arr.length - 1][j] += arr[i][j];         // 열 합
	            arr[arr.length - 1][arr[i].length - 1] += arr[i][j]; // 전체 합
	        }
	    }

	    // 출력
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
	            System.out.print(arr[i][j] + "\t");
	        }
	        System.out.println();
	    }
	}

	public void practice5() {
		System.out.print("행 크기 : ");
		int num1 = sc.nextInt();
		System.out.print("열 크기 : ");
		int num2 = sc.nextInt();
		
		char [][] arr= new char [num1][num2];
		
		for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {

	    		char ch = (char)((int)(Math.random() * 26) + 65);
	            arr[i][j] = ch;
	            System.out.print(arr[i][j]+ " ");
		
	}System.out.println();
	
	
	
}

	}
}















