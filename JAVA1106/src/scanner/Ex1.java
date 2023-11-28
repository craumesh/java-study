package scanner;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner
		 * - 화면, 파일, 문자열과 같은 입력소스로부터 문자데이터를
		 * 	읽어오는데 사용되는 클래스
		 * - 여러 형태의 생성자를 오버로딩하여 지원하므로 다양한
		 * 	입력소스로부터 데이터를 읽을 수 있음
		 * 	(ex. scanner(String source), scanner(file source) 등)
		 * - 정규표현식(Regular Expression)을 이용한 라인단위의 검색을 지원
		 * - nextXXX 메서드를 통해 입력받은 문자를 다시 변환하는 수고를 덜어줌
		 * 	(ex. nextInt() : int , nextLine() : String)
		 * - Scanner 를 사용하기 위해서는 java.util.Scanner import 필요
		 * 
		 * < Scanner 설정 문법 >
		 * Scanner 변수 = new Scanner(); // 입력을 받을 시 System.in 활용
		 * 변수.nextXXX() 메서드를 호출하여 입력 받음
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		String input = "";
//		do {
//			System.out.print("원하는 값을 입력하거나 Q를 입력하여 종료하십시오 : ");
//			//input = scan.next();
//			// => 입력한 값을 라인 단위로 읽어오나 공백을 허용하지 않음
//			// => 1 1을 입력하면 공백을 구분자로 판단하여 앞의 1만 입력받음
//			
//			input = scan.nextLine();
//			System.out.println("입력하신 값은 " + input + " 입니다");
//		} while (!input.equals("Q"));
//		System.out.println("입력이 종료되었습니다!");
		
		System.out.println("==============================================================");
		
//		try {			
//			System.out.print("숫자(정수)를 입력하세요 : ");
//			int num = scan.nextInt();
//			System.out.println(num);			
//		} catch(InputMismatchException e) {
//			System.out.println("숫자(정수)만 입력하세요!");
//		}
//		System.out.println("입력 종료");
//		
//		try {			
//			System.out.print("숫자(실수)를 입력하세요 : ");
//			double dnum = scan.nextDouble();
//			System.out.println(dnum);			
//		} catch(InputMismatchException e) {
//			System.out.println("숫자(실수)만 입력하세요!");
//		}
//		System.out.println("입력 종료");
		
		try {	
			System.out.print("true 또는 false 를 입력하세요 : ");
			boolean b = scan.nextBoolean();
			System.out.println(b);
		} catch(InputMismatchException e) {
			System.out.println("true 또는 false 만 입력하세요!");
		}
		// => 대소문자 구별없이 true 또는 false 만 입력 가능
		
		
	}

}
