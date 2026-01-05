package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
		private Member [] m = new Member[SIZE];
		public static final int SIZE = 10; 
		
		public int existMemberNum() {
			int count = 0;
			for( Member mem : m ) {
				if(mem !=null) {
					count++;					
				}
			}
			
			return count;
		}
		
		public Boolean checkId(String inputId) {
			boolean isDup = false;
			for(Member mem : m) {
				if(mem !=null &&inputId.equals(mem.getId())) {
					isDup=true;
					break;
				}
			}
			return isDup;
		}
		
		public void insertMember(String id, String name, String password, String email, char gender, int age) {
			// 전달받은 데이터로 객체 생성
			Member mem = new Member(id, name, password, email, gender, age);
			// 생성한 객체를 객채배열상 비어있는 부분에 저장
			for(int i=0;i<m.length;i++) {
				if(m[i] == null) {
					m[i]= mem;
					break;
				}
			}
		}
		
		public String searchId(String id) {
			for(Member mem : m) {
				if(mem!=null && mem.getId().equals(id)) {
					return mem.toString();
					
				}
			}
			return null;
		}
		
		public Member[] searchName(String name) {
			Member[] m = new Member[SIZE];
			
			int index=0;
			for(Member mem : this.m) {
				if(mem.getName().equals(name)) {
					m[index++] = mem;
				}
			}
			
			if(index==0) {
				return null;
			}else {
				// 내가 찾은 회원이 1명인 경우
				//[mem,null,null,null....]
				Member[] copy = Arrays.copyOf(m, index);
				return m;
			}
		}

		
		
		public Boolean updatePassword(String id, String password) {
			for(int i=0; i<m.length;i++) {
				Member mem = m[i];
				if(mem !=null && mem.getId().equals(id)) {
					mem.setPassword(password);
					return true;
				}
			}
			return false;
		}
		
		public Boolean updateName(String id, String email) {
			return true;
		}
		
		public Boolean delete(String id) {
			for(int i = 0; i<m.length;i++) {
				if(m[i]!=null && m[i].getId().equals(id)) {
					m[i]=null;
					return true;
				}
			}
			return false;
		}
		
		public void delete() {
			m = new Member[SIZE];
		}
		
		public Member[] printAll() {
			return m;
		}
		
		
		
		
		
		
		
}
