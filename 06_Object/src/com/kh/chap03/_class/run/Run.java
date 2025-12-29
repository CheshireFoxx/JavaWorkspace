package com.kh.chap03._class.run;

import com.kh.chap03._class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p = new Person();
		p.changeName("김동우");
		p.printName();

	}

}
