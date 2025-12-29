package com.kh.chap04.field.run;

import com.kh.chap04.field.model.vo.FieldTest1;
import com.kh.chap04.field.model.vo.FieldTest2;
import com.kh.chap04.field.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		FieldTest1 ft1 = new FieldTest1();
		//ft1.test(0);
		
		FieldTest2 ft2 = new FieldTest2();
		System.out.println(ft2.pub);
		//System.out.println(ft2.pro);
		//System.out.println(ft2.df);
		//System.out.println(ft2.pri);
		
		// protected, default의 경우에는 같은 패키지인 경우에만 가능
		
		// FiledTest3의 필드 및 메서드 호출
		// 클래스명.static 필드명 or 클래스명.static메서드()
		System.out.println(FieldTest3.PI); // 객체생성 불필요
		// 객체를 생성하지 않아도, 이미 메모리에 저장공간이 할당된 상황이기 때문.
		FieldTest3.test();
	}

}
