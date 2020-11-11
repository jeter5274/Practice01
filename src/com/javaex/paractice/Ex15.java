package com.javaex.paractice;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		final double MILE_TO_KM = 1.609;
		double mile, km;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요 : ");
		mile = sc.nextDouble();
		km = mile * MILE_TO_KM;
		
		System.out.println(mile +"마일은 "+ km +"킬로미터 입니다.");
		
		sc.close();
	}

}
