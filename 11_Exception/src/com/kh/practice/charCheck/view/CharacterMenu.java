package com.kh.practice.charCheck.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
		public void menu() {
			CharacterController cc = new CharacterController();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			
			try {	
				System.out.print("문자열 : ");
				//String str = br.readLine();
				String str = sc.nextLine();
				System.out.println(str+"에 포함된 영문자 개수"+cc.countAlpha(str));
				
			}catch(CharCheckException c) {
				//System.out.println("체크할 문자에 공백이 포함되어 있습니다.");
				c.printStackTrace();
				
			}
			
		}
}
