package com.test01;

public class Variable04 {
	public static void main(String[] args) {
		Variable04 test = new Variable04();
		test.test1();
		test.test2();
		test.test3();
	}
	public void test1(){
		boolean flag = true;
		//flag = 100; boolean 자료형은 true, false만 저장 가능
		
		//자동형변환(Upcasting)
		int num = '0';
		System.out.println(num);
		
		char ch = 97;
		System.out.println(ch);
		
		char ch2 = (char)num;
		System.out.println(ch2);
		
		num = -97;
		ch2 = (char)num;
		System.out.println(ch2);
	}
	
	public void test2() {
		int inum = 10;
		long lnum = 100;
		
		int isum = (int)(inum + lnum);
		System.out.println(isum);
		
		int isum2 = inum + (int)lnum;
		System.out.println(isum2);
		
		long isum3 = (long)inum + lnum;
		System.out.println(isum3);
	}
	
	public void test3() {
		long lnum = 100;
		float fnum = lnum;
		System.out.println(fnum);
		
		double dnum = 10.5;
		int inum = (int)dnum;
		System.out.println(inum); //10.5 -> 10 : 데이터 손실 발생.
	}
}
