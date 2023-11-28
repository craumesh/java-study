package java_util_package;

import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println(ActivateCodeGenerator.codeCreate());
		}
		
		System.out.println("==========================================================");
		
		// 난수를 활용하여 특정 범위의 값을 발생시키기
		// E-mail 인증코드(문자) 생성
		// 1. 인증코드에 사용될 문자를 배열로 모두 저장하기
		char[] codeTable = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
							'N','O','P','Q','R','S','T','U','W','X','Y','Z',
							'a','b','c','d','e','f','g','h','i','j','k','l','m',
							'n','o','p','q','r','s','t','u','w','x','y','z',
							'0','1','2','3','4','5','6','7','8','9','!','@','$'};
		
	
		Random r2 = new Random();
		String code = "";
		int codeLength = 20;
		
		for(int i = 1; i <= codeLength; i++) {
			int index = r2.nextInt(codeTable.length);
			code += index;
		}
		System.out.println(code);
	}
}

class ActivateCodeGenerator {
	public static String codeCreate() {
		Random r = new Random();
		return codeFomat(r.nextInt(1000000));
	}
	
	/*
	 * 4자리보다 작은 자릿수를 갖는 정수를 4자리로 만드는 방법
	 * (부족한 앞자리 숫자를 0으로 채우기 = 0으로 패딩
	 * => String 클래스의 fotmat() 메서드를 활용
	 * => format() 메서드 첫번째 파라미터로 형식 지정 패턴 문자열 지정
	 * 		%d가 10진수이며, %4d는 10진수 4자리로 표기
	 * 		%04d는 10진수 4자리로 표기할 때 부족한 앞자리는 0으로 채움 
	 */
	
	public static String codeFomat(int i) {
		return String.format("%06d", i);
	}
}