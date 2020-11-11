package com.javaex.paractice;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
	
		double temp_c, temp_f;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 :  ");
		temp_f = sc.nextDouble();
		
		temp_c = 5.0/9.0 * (temp_f - 32);
		
		System.out.println("화씨 "+ temp_f +"의 섭씨 온도는 "+ temp_c +" 입니다.");
		
		sc.close();

	}

}
