package operator;

public class Ex6 {

	public static void main(String[] args) {
		/* 논리 연산자(&&, ||...)
		 * - 피연산자의 논리적인 판별을 수행하는 연산자
		 * - 피연사자 모두 boolean 타입 데이터
		 * - &은 무조건 조건을 모두 체크, &&는 먼저 계산한 boolean 값이 false이면 뒤의 계산 생략
		 * 
		 * <XOR 연산자(^)>
		 * - 피연산자가 서로 다를 경우 결과값이 true, 같을 경우 false
		 */
		
		int num = 30;
		
		System.out.println(num < 5 || num > 100);
		System.out.println(!(num < 5 || num > 100));
		System.out.println(num > 5 && num < 100);
	}

}
