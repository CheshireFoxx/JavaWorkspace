package com.kh.practice.thread;

public class Data {
		private int value;
		private boolean isEmpty = true;
		
		public Data() {
			
		}

		public Data(int value, boolean isEmpty) {
			super();
			this.value = value;
			this.isEmpty = isEmpty;
		}

		public int getValue() {
			synchronized (this){
				if(isEmpty){
					try {
						throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오...");
					}catch(EmptyException e){
						String errMessage = e.getMessage();
						System.out.println(errMessage);
						try {
							wait();  // 값이 찰 때까지 대기..							
						}catch(InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}
			}isEmpty= true;
			System.out.println("get value : "+value);
			System.out.println("값을 꺼냈습니다. value가 비었습니다.");
			notify();
			
			return value;
		}

		public void setValue(int value) {
			synchronized (this) {
				if(!isEmpty) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
				}
				isEmpty = false;
				System.out.println("잘못 입력되었습니다.");
				System.out.println("put value : "+value);
				this.value = value;
				notify();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
}
