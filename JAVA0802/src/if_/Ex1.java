package if_;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 조건문
		 * - 조건식 결과에 따라 실행할 문장이 달라지는 문
		 * - if와 switch로 구분
		 * 
		 * [IF문]
		 * 1. 가장 단순한 조건문
		 * 2. 조건이 TRUE일때 특성 문장을 추가로 실행
		 * 
		 * <기본 문법>
		 * 문장 1;
		 * IF(조건식){
		 * 조건식 판별 결과가 TRUE 일때 실행할 문장2;
		 * }ELSE{
		 * 조건식 판별 결과가 TRUE가 아닐때 실행할 문장3;
		 * }
		 * 문장4;
		 * 
		 * -> 조건식 판별 결과 TRUE : 문장 1 -> 조건식(TRUE) -> 문장 2 -> 문장 4
		 * -> 조건식 판별 결과 FALSE : 문장 1 -> 조건식(FALSE) -> 문장 3 -> 문장 4
		 */ 
		
		System.out.println("문장1");
		int i = 5;
		if(i < 10) {
			System.out.println("문장2");
		}else {
			System.out.println("문장3");
		}
		System.out.println("문장4");
		
		// 정수 num2 의 절대값을 ㄱ산하여 출력
		int num2 = -5;
		
		// num2 가 0보다 작을 때 (음수일 때)
		if(num2 < 0) {
			// 조건식 결과가 true 일 때(음수일 때) 실행할 문장들
			// 변수 num2에 음수 부호를 붙여서 다시 변수 num2에 저장
			num2 = -num2;
			System.out.println("음수를 양수로 변환! ");
		}
		System.out.println("num2의 절대값 : " + num2);
	}
}
