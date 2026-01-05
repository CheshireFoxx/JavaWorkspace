package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
		private Member [] m = new Member[SIZE];
		public static final int SIZE = 10; 
		
		public int existMemberNum() {
			return 0;
		}
		
		public Boolean checkId(String inputId) {
			return true;
		}
		
		public void insertMember(String id, String name, String password, String email, char gender, int age) {
				m[0] = new Member(id, name, password, email, gender, age);
			 
		}
		
		public String searchId(String id) {
			return "";
		}
		
		public Member[] searchName(String name) {
			
		}
		
		public Member[] searchEmail(String email) {
			
		}
		
		public Boolean updatePassword(String id, String password) {
			
		}
		
		public Boolean updateName(String id, String email) {
			return true;
		}
		
		public Boolean delete(String id) {
			
		}
		
		public void delete() {
			
		}
		
		public Member[] printAll() {
			
		}
		
		
		
		
		
		
		
}
