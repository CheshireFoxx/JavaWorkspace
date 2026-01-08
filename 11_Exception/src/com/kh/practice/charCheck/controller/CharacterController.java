package com.kh.practice.charCheck.controller;

import java.awt.print.PrinterAbortException;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
		public CharacterController() {
			
		}
		
		public int countAlpha(String s) throws CharCheckException{
			if(s.contains(" ")) {	
				throw new CharCheckException("체크할 문자에 공백이 포함되어 있습니다.");
			}
			
			int count = 0;
			for(int i=0; i<s.length();i++) {
				char ch = s.charAt(i);
					if(('A'<=ch&&ch<='Z')||('a'<=ch && ch<='z'))
					count++;
			}
			return count;

		}
	
}
