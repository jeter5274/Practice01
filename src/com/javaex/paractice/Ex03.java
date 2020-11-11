package com.javaex.paractice;

public class Ex03 {
	public static void main(String[] agrgs) {
		int x = 1;
		int y = 1;
		
		int a = ++x * 2;	//x+1을 한뒤 2를 곱해서 a에 할당 x=2, a = 2*2
		int b = y++ * 2;	//y를 2곱하서 b에 할당 후 y+1, b = 1 * 2, y = 2
		
		System.out.println("a=" + a);	//4
		System.out.println("b=" + b);	//2
		System.out.println("x=" + x);	//2
		System.out.println("y=" + y);	//2
	}
}
