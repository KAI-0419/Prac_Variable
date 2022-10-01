package com.test01;

import java.util.Scanner;

public class Variable02 {
	//키보드 입력 테스트
	
	public static void main(String[] args) {
		
		//준비 => 클래스명 변수명 = new 클래스명();
		Variable02 test = new Variable02();
		
		//실행 => 변수명.메소드();
		test.inputTest();
	}
	
	public void inputTest() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("이름을 입력 하시오: ");
//		name = sc.next();
		name = sc.nextLine();
		
		System.out.print("나이를 입력 하시오: ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력 하시오: ");
		double height = sc.nextDouble();
		
		System.out.print(name + "님은" + age + "살 이고, 키는 " + height + "입니다.");
	}
}
