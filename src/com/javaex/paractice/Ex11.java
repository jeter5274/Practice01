package com.javaex.paractice;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m_money, tenyear_money;
		
		System.out.print("월급을 입력하세요 : ");
		m_money = sc.nextInt();
		tenyear_money = m_money * 12 * 10; //월급 * 12개월 * 10년
		
		System.out.println("10년동안 최대 저축액은 " + tenyear_money +"원 입니다.");
		
		sc.close();
	}

}
