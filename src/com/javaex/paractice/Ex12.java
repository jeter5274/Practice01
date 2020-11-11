package com.javaex.paractice;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		final float PI = 3.14f;
		float harf_diameter, cir_space;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요 : ");
		harf_diameter = sc.nextFloat();
		cir_space = PI * harf_diameter * harf_diameter;
		
		System.out.println("원의 넓이는 "+ cir_space);
		
		sc.close();
	}

}
