package com.test01;

public class Variable01 {
	
	public static void main(String[] args) {
		
		//기능 실행 or 메소드 호출
		Variable01.initVariable();
	}
	
	public static void declareVariable() {
	
	}
		
		//--------------------------------------
		
		//method
		public static void initVariable() {
			//변수 선언과 동시에 초기화
			//정수
			byte bnum = 1; //1byte
			short snum = 2;	//2byte
			int inum = 4;	//4byte
			long lnum = 8; //8byte
			
			//실수
			float fnum = 4.0f; //4byte
			double dnum = 8.0; //8byte
			
			//논리
			boolean isTrue = true; //1byte
			
			//문자
			char ch = 'A'; //2byte
			
			//문자열(참조)
			String str = "안녕하세요!";
		
		
		//출력하기
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		
		System.out.println(fnum);
		System.out.println(dnum);
		
		System.out.println(isTrue);
		
		System.out.println(ch);
		System.out.println(str);
		
}
}