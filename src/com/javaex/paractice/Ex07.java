package com.javaex.paractice;

public class Ex07 {

	public static void main(String[] agrgs) {
		
		int i = 10;
		int n = ++i %2;	//i = 10 + 1, 후 n = i%2
		//ex06과 차이점은 증가연산자의 위치로, 연산과 라인실행의 우선순위기 달라 i가 증가되고 라인이 실행된다.
		
		System.out.println(i);	//11
		System.out.println(n);	//1

	}
}
