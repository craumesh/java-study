package class_;

public class Animal {

	/*
	 * 동물에 해당하는 Animal 클래스 정의
	 * 1. 분석
	 * 	- 속성 : 이름, 나이
	 * 	- 기능 : 짖다
	 * 
	 * 2. 설계 - 클래스 정의
	 * < 클래스 정의 기본 문법 >
	 * [접근제한자] class 클래스명 {
	 * 		// (멤버)변수
	 * 		// 메서드
	 *	} 
	 */
	
	String name;
	int age; 
	
	public void cry() {
		System.out.println("동물 울음 소리!");
	}
}
