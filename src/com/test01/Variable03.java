package com.test01;

public class Variable03 {
	public static void main(String[] args) {
		Variable03 test = new Variable03();
		test.finalTest();
		Variable03 overflow = new Variable03();
		overflow.overflowTest();
	}
	public void finalTest() {
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		System.out.println("age: "+age);
		System.out.println("AGE: "+AGE);
		
		age = 30;
//		AGE = 30; 변경불가!
		System.out.println("변경 후 age: " + age);
		System.out.println("변경 후 AGE: " + AGE);
	}
	//오버플로우 테스트
	public void overflowTest() {
//		byte bnum = 129;
		
		byte bnum = 127;
		bnum = (byte)(bnum + 1);  //byte + int => int 형 변환
		
		System.out.print("bnum:" + bnum);
	}
}

