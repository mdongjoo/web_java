package day01;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
//		16. 두 개의 실수형 변수 num1과 num2를 선언하고, 
//		사용자로부터 입력을 받아 두 수를 나눈 결과를 소숫점 두 자리까지 출력하기
		//로직
		//Scanner import
		//실수형 변수 2개 선언 후 입력받기
		//printf %.2d
		Scanner scan = new Scanner(System.in);
		System.out.print("실수 2개를 입력하세요 :");
		double num1, num2 ; 
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		System.out.printf("결과 값 :%.2f",num1/num2);
		
		scan.close();

	}
}
