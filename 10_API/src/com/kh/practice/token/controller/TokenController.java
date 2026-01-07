package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	
	
			public TokenController() {
				
			}
			
			public String afterToken(String str) {
				// 방법 1. System.out.println(str.replace(" ","");
				
				// 방법 2. String[] arr= str.split(" ");
				//		 for(String s:arr){
				//				result +=s;}
				
				// 방법 3.
				StringTokenizer stn = new StringTokenizer(str, " ");
				String result=" ";
				
				while(stn.hasMoreElements()){
					result +=stn.nextToken();
				}
				
				return result.trim();
			}
			
			public String firstCap(String input) {
				//String str = String.valueOf(input.replace(input.charAt(0),input.toUpperCase().charAt(0)));
				//return str;
				String other = input.substring(1);
				String first = input.substring(0, 1).toUpperCase().concat(other);
						
				return first;
			}
			
			public int findChar(String input, char one) {
				// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
				int count = 0;
				char [] arr = input.toCharArray();
				for(int i=0; i<input.length();i++) {
					if(arr[i]== one) {
						count++;
					}
				}

						return count;
			}
			
}
