package switch_;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * switch ~ case문
		 * - if문 처럼 특정 조건에 대해 여러가지 판별을 수행하는 조건문
		 * -> 단 if문과는 달리 범위에 대한 판별 등이 불가능하며
		 * 값에 대한 동등 비교만 가능함
		 * - switch 문의 조건식에는 연산식 또는 변수, 리터럴 등이 올 수 있으나
		 * 반드시 정수 또는 문자열(또는 enum 타입 변수)만 사용 가능
		 * -> 이중 정수는 byte, short, char, int만 사용 가능
		 * - switch 문에서 지정한 조건에 맞는 값을 case 문에서 탐색하여
		 * 일치하는 값을 갖는 case 문의 문장을 실행함
		 * 이 때, case 문에는 조건식 결과를 비교할 리터럴 1개만 명시함
		 * - 일치하는 case 문이 없을 경우 default 문을 찾아서 실행함
		 * -> else 문과 유사하며, 생략 가능
		 * -case 문의 문장 실행 후 break 문을 만나면 switch 문을 빠져나감
		 * 단, break 문이 없을 경우 다음 break 문을 만나거나
		 * switch
		 * switch 문에는 연산식도 사용 가능 하지만 연산 결과가
		 * 정수, 문자열 타입이어야 한다(실수형 사용 불가)
		 */
		Scanner sc = new Scanner(System.in);
		
		Loop1:
		while(true) {		
//			int num = sc.nextInt();
//			
//			switch(num) {
//			case 0: System.out.println("종료!"); break Loop1;
//			case 1:
//			case 2:
//			case 3: System.out.println("num = " + num); break;
//			default: System.out.println("undefined num");
//			}
//			String str = sc.next();
//			
//			switch(str) {
//			case "종료": System.out.println("종료!"); break Loop1;
//			case "대한민국":
//			case "KOREA":
//			case "한국": System.out.println("str = " + str); break;
//			default: System.out.println("undefined str");
//			}
			
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			
			switch(num/num2) {
			case 1: System.out.println("종료!"); break Loop1;
			case 2:
			case 3:
			case 4: System.out.println("str = " + num/num2); break;
			default: System.out.println("undefined str");
			}
		}		
	}
}