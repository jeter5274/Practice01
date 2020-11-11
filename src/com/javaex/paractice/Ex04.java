package com.javaex.paractice;

public class Ex04 {

	public static void main(String[] agrgs) {
		
		int x, y, sum;
		
		
		//x = 10 세미콜론(;)이 누락됨
		//y = 10 세미콜론(;)이 누락됨 
		
		//sum = x + y sum변수가 선언되지 않았으며,  세미콜론(;)이 누락됨
		
		x = 10;
		y = 10;
		
		sum = x + y;
		
		//System.out.println("합은 ' + sum); 문자열을 묶고있는 쌍따옴표의 마무리가 틀림 "합은 "로 정정
		System.out.println("합은 " + sum);
	}

}
