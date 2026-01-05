package com.kh.chap01_poly.part01.run;

import com.kh.chap01_poly.part01.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * '='(대입연산자)를 기준으로 왼쪽과 오른쪽의 자료형은 항상 같아야 한다.
		 * 1. 부모타입 참조변수로 부모타입 객체를 다루는 경우
		 */
		
		System.out.println("1. 부모타입 참조변수로 부모 객체 다루기");
		// 부모 타입 참조변수 p1 = 부모 타입 객체
		Parent p1 = new Parent();
		p1.printParent();
		
		// 2. 자식 타입 참조변수로 자식 타입 객체를 다루는 경우
		System.out.println("2. 자식 타입 참조변수로 자식타입 객체를 다루기");
		Child01 c1 = new Child01();
		c1.printParent(); // super(부모)의 메서드 호출
		c1.printChild01(); // this에서 메서드 호출
		
		// 3. 부모 타입 참조변수로 자식 타입 객체를 다루는 경우
		System.out.println("부모 타입 참조변수로 자식 타입 객체를 다루기");
		Parent p2 = (Parent) new Child01(); // 다형성이 적용된 개념
		
		p2.printParent();
		
		// 자식 클래스의 메서드에 접근하고자 한다면, 다운캐스팅이 필요하다.
		((Child01)p2).printChild01();
		
		
		/*
		 *  대입 연산자 기준 양쪽의 자료형이 다름에도 불구하고 오류가 나지 않는다.
		 *  이유는, 자식 개체가 부모 자료형으로 '자동 현변환'되고 있기 때문.
		 *  상속 구조의 경우 클래스간의 형변환이 가능.
		 *  
		 *  클래스간 형변환
		 *  1. UpCasting
		 *	- 자식 타입에서 부모 타입으로 자동 형변환
		 	- 자동 형변환이 가능하므로 형변환연산자는 생략이 가능
		 	- ex) 자식 객체.부모 메서드();
		 				부모 참조변수 = 자식 객체;
		 *  
		 *  2. DownCasting
		 *  - 부모타입에서 자식타입으로 형변환 되는 경우
		 *  - 생략이 불가능(강제 형변환 필요)
		 *  - ex) ((자식)부모).자식메서드();
		 *  
		 *  다형성을 사용하는 이유
		 *   - 부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 "하나의 부모클래스로" 다룰 수 있기 때문.
		 *  
		 */

		// 다형성 적용 전
		// Child01 객체와 Child02객체를 객체 배열로 만들기
		Child01 [] arr1 = new Child01[2];
		arr1[0] = new Child01(1,2,4);
		arr1[1] = new Child01(3,2,5);
		
		Child02[] arr2 = new Child02[2];
		arr2[0] = new Child02(1,2);
		arr2[1] = new Child02(3,4);
		
		
		// 다형성이 적용된다면, 부모타입 레퍼런스로 다양한 자식객체들을 받아줄 수 있다.
		Parent [] arr = new Parent[4];
		arr[0] = new Child01(1,2,4);
		arr[1] = new Child02(2,4);
		arr[2] = new Child01(4,5,4);
		arr[3] = new Child02(5,6);
		
		// 반복문을 활용한 메서드 호출
		for(int i=0; i<arr.length;i++) {
			// 각 인덱스 별로 실제 참조하고 있는 자식클래스로 적절히 다운캐스팅 후, 메서드를 호출하려면?
			// (instanceof 자료형) 연산자 활용
			// - 객체가 실제로 참조하고 있는 클래스를 확인하여 자료형과 같다면 true, 다르다면 false를 반환한다.
//			if(arr[i] instanceof Child01) {
//			((Child01)arr[i]).printChild01();
//		}
//			else if(arr[i] instanceof Child02){
//				((Child02)arr[i]).printChild02();
//			}
			
			
		// 2. 오버라이딩을 이용하기.
		
		/*
		 * 동적 바인딩
		 * - 프로그램이 실행되기 전에는 컴파일 단계에서 참조변수의 클래스 메서드를 실행한다고 나오지만
		 * 	 실제 런타임 단계에서는 자식 객체의 내부의 오버라이딩된 메서드를 찾아가서 실행하는 기능.
		 */
			arr[i].print();
			
			
			
			
			
			
			
			
			
			
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
