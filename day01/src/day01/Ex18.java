package day01;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
//		18. 사용자로부터 이름과 나이를 입력받아 
//		"안녕하세요, [이름]님. [나이]살이시군요." 형식으로 환영 메시지를 출력하기
		//로직
		//Scanner import
		//String , int 변수 선언
		//입력 엔터소모 Line사용
		//출력문
		Scanner scan = new Scanner(System.in);
		String name ="";
		int age =0 ; 
		System.out.print("이름을 입력해주세요 :");
		name = scan.nextLine();
		System.out.print("나이를 입력해주세요 :");
		age = scan.nextInt();
		System.out.println("\"안녕하세요, "+ name + "님. "+ age+"살이시군요.\"");
		
		
		scan.close();
	}
}
