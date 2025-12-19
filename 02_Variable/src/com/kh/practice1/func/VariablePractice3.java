package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
		public void practice3() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("가로 : ");
			double 가로 = sc.nextDouble();
			
			System.out.print("세로 : ");
			double 세로 = sc.nextDouble();
			
			System.out.println("면적 :" + 가로 * 세로);
			System.out.println("둘레 :" + (가로 + 세로)*2);
			
			
			
		}
}
