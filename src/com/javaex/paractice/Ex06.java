package com.javaex.paractice;

public class Ex06 {

	public static void main(String[] agrgs) {
		
		int i = 10;
		int n = i++ %2;	//n = 10%2, 후 i = 10 + 1
		
		System.out.println(i);	//11
		System.out.println(n);	//0
	}
}
