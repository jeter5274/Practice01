package com.javaex.paractice;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		double wid, hei, space, border;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요 : ");
		wid = sc.nextDouble();
		System.out.print("세로를 입력하세요 : ");
		hei = sc.nextDouble();
		
		space = wid * hei;
		border = (wid*2) + (hei*2);
		
		System.out.println("사각형의 넓이는 "+ space);
		System.out.println("사각형의 둘레는 "+ border);
		
		sc.close();
	}

}
