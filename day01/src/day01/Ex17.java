package day01;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
//		17. 두 개의 정수형 변수 num1과 num2를 선언하고,
//		사용자로부터 입력을 받아 두 수를 더한 결과를 출력하기
		//로직 
		//Scanner import
		//정수형 2개 선언
		Scanner scan = new Scanner(System.in);
		int num1 , num2 ;
		System.out.print("정수형 변수 2개를 입력하세요 :");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("합 : "+(num1 + num2));
	}
}
