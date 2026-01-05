package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
		private Student[] s = new Student[3];
		private Employee[] e = new Employee[10];
		
		public int[] personCount() {
			int m = 0;
			int n = 0;
			int [] pCount = new int[2];
			
			
			for(int i=0; i<s.length;i++) {
				if(s[i]!=null) {
				m++;
				pCount[0]=m;
				}
			
			}
			
			for(int j =0; j<e.length;j++) {
				if(e[j]!=null) {
				n++;
				pCount[1]=n;
			}
			}return pCount ;
			
			
			}
			
		
		public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
			Student std = new Student(name, age, height, weight, grade, major);

			for(int i=0;i<s.length;i++) {
				if(s[i] == null) {
					s[i]= std ;
					break;
				}
			}
			
			
			}
		
		public Student[] printStudent(){
			return s;
		}
		
		public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
			Employee emp= new Employee(name, age, height, weight, salary, dept);

			for(int j=0;j<e.length;j++) {
				if(e[j] == null) {
					e[j]= emp ;
					break;
				}
				}
		}
		
		public Employee[] printEmployee() {
			return e;
		}
		
		
		
		
		
		
		
}
