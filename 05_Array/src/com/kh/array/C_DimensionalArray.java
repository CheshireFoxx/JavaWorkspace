package com.kh.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C_DimensionalArray {
		public void method1() {
			/*
			 * 이차원 배열 선언
			 * [표현법]
			 * 1. 자료형 배열명[][];
			 * 2. 자료형 [] 배열명 [];
			 * 3. 자료형 [][] 배열명;
			 */
			
			int arr1[][];
			int []arr2[];
			int [][]arr3;
			
			/*
			 * 이차원 배열 할당(크기지정)
			 * 배열명 = new 자료형 [행크기][열크기];
			 * 배열명 = new 자료형 [2차원배열 크기][1차원배열크기];
			 */
			
			arr3 = new int[2][3];
			
			// 이차원 배열 선언과 동시에 할당
			int[][]arr = new int[3][5];
			/*
			 * [0,0,0,0,0]
			 * [0,0,0,0,0]
			 * [0,0,0,0,0]
			 */
			
			System.out.println(arr); //주소값
			System.out.println(arr[0]); //1행의 주소값
			System.out.println(arr[0][0]); //1행 1열의 값 (0)
			
			System.out.println(arr.length); // 3
			System.out.println(arr[0].length); // 5
			
			//중첩반복문을 활용한 2차원 배열 순회
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
		}
		
		
		public void method2() {
			
			/*
			 * 1행 [1,2,3,4,5]
			 * 2행 [6,7,8,9,10]
			 * 3행 [11,12,13,14,15]
			 * 2차원 배열을 선언 및 할당하고, 위 데이터 형식으로 초기화시켜보시오.
			 */
			
			
			int [][] arr = new int[3][5];
			
			int value= 0;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j]=value++;
					System.out.print(arr[i][j]+ " ");
			}
		}
			System.out.println();
			for(int i=0; i<arr.length; i++) {
				System.out.println(Arrays.toString(arr[i]));
			}
	}
		
		public void method3() {
			//배열 선언 및 할당과 초기화
			int[] iArr = {1,2,3,4,5};
			int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
			
			
			//가변배열
			// -행의 크기는 정해져 있으나, 행별 열의 개수가 정해지지 않은 배열
			// -이차원 배열은 1차원 배열을 여러 개 묶음으로 관리하는 형태긴 하지만, 일차원 배열의 크기가 꼭 같을 필요는 없다.
			//
		}
}
