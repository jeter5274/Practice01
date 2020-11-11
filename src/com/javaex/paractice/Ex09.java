package com.javaex.paractice;

public class Ex09 {

	public static void main(String[] agrgs) {
		
		double f=80.0;
		//System.out.println(5/9*(f-32.0)); //5/9가 정수 나누기로 0이 되어서 값이 0이 나옴, 실수형으로 변경해야함
		System.out.println(5.0/9.0*(f-32.0)); //방법1. 실수형으로 숫자를 기입
		System.out.println((double)5/9*(f-32.0)); //방법2. 5를 double로 형변환
		System.out.println(5/(double)9*(f-32.0)); //방법3. 9를 double로 형변환
		System.out.println((double)5/(double)9*(f-32.0)); //방법4. 5와 9를 double로 형변환
		
		//위 4가지 방법 중 정확하게 표현하기 위해서는 1, 4번이 좋을 것 같음
	}

}
