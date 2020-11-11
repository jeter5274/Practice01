package com.javaex.paractice;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		int coin_500, coin_100, coin_50, coin_10, sum_coins;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수 : ");
		coin_500 = sc.nextInt() * 500;
		System.out.print("100원 개수 : ");
		coin_100 = sc.nextInt() * 100;
		System.out.print("50원 개수 : ");
		coin_50 = sc.nextInt() * 50;
		System.out.print("10원 개수 : ");
		coin_10 = sc.nextInt() * 10;
		
		sum_coins = coin_500 + coin_100 + coin_50 + coin_10 ;
		
		System.out.println("동전의 총합은 "+ sum_coins +" 원 입니다.");
		
		sc.close();

	}

}
