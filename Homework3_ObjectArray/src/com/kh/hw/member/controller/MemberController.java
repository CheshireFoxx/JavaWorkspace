package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
		private Member [] m = new Member[SIZE];
		public static final int SIZE = 10; 
		
		public int existMexistMemberNum() {
			return 0;
		}
		
		public Boolean checkId(String inputId) {
			return true;
		}
		
		public void insertMember(String id, String name, String password, String email, String gender, int age) {
			
		}
		
		public String searchId(String id) {
			return "";
		}
		
		public Member[] searchName(String name) {
			return [];
		}
		
		public Member[] searchEmail(String email) {
			
		}
		
		public Boolean updatePassword(String id, String password) {
			
		}
		
		public Boolean updateName(String id, String email) {
			return true;
		}
		
		public Boolean delete(String id) {
			return true;
		}
		
		public void delete() {
			
		}
		
		public Member printAll() {
			return;
		}
		
		
		
		
		
		
		
}
