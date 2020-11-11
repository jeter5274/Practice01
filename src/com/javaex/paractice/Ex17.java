package com.javaex.paractice;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		double harf_diameter, sphere_space;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		harf_diameter = sc.nextDouble();
		
		sphere_space = (4 * PI * (harf_diameter * harf_diameter * harf_diameter)) / 3;
		
		System.out.println("구의 부피는 : "+ sphere_space +" 입니다.");
			
		sc.close();
		
	}

}
