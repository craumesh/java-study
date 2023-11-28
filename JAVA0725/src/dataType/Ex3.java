package dataType;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 자바에서 char는 2Byte(16bit) 크기의 0~65535 사이의 정수형 데이터로 처리됨
		 * '작은 따옴표'로 표현되며 유니코드 방식을 사용
		 * ->아스키코드를 기반으로 문자를 추가하여 만든 코드 체계
		 * ->ASCII(7bit) - 미국 표준 문자 코드*/
		
		char ch = ' ';
		ch = '\u0041';
		System.out.println(ch);
		
		/* 문자열 데이터 타입 String - 참조 데이터 타입(4byte)
		 * "큰 따옴표"로 표현 */ 
		
		String str = "go to hell";
		System.out.println(str);
		
	}

}
