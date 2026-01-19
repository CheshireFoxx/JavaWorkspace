package com.kh.practice;

public class LambdaPractice3 {
			public static void main(String[] args) {
				Myfuncion<String,String> first = a -> a.toUpperCase();
				Myfuncion<String,Boolean> second = a-> a.length()==5;
				Myfuncion<String,String> third = str-> {
					String [] arr = str.split("");
					StringBuilder sb = new StringBuilder();
					for(String s : arr) {
						sb.append(s).append("-");
						
					}
					sb.deleteCharAt(sb.length()-1);
					return sb.toString();
				};
				
				System.out.println("lambda");
			}
			
			@FunctionalInterface
			interface Myfuncion<V,B>{
				B apply(V v);
			}
}
