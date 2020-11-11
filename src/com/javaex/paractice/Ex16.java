package com.javaex.paractice;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		double price, get_money, tax, balance;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격 : ");
		price = sc.nextDouble();
		System.out.print("받은돈 : ");
		get_money = sc.nextDouble();
		
		/* 이것이 진짜 
		tax = price / 11;
		balance = get_money - price;	
		price -= tax;
		*/
		
		//출제 의도
		tax = price*0.1;
		balance = get_money - price;	
		
		System.out.println("=====================");
		System.out.println("받은돈 : "+ get_money);
		System.out.println("상품가격 : "+ price);
		System.out.println("부가세 : "+ tax);
		System.out.println("잔액: "+ balance);
		
		sc.close();
	}

}
