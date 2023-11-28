package String;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String 클래스
		 * - 문자열 데이터를 처리하는 클래스
		 * - 리터럴을 사용하여 문자열을 직접 생성하거나
		 * 	new 연산자를 사용한 인스턴스 생성 시 생성자에 문자열을 전달하여 생성
		 * 	=> 리터럴 사용 시 해당 문자열 존재 여부를 상수풀에서 검사한 후
		 * 		중복되는 문자열이 없으면 생성하고, 중복될 경우 주소값을 리턴하므로
		 * 		메모리 공간 낭비가 줄어들게 됨
		 * 	=> new 연산자 사용 시 문자열 중복 여부와 무관하게 문자열 객체 생성
		 * - 문자열 내용 비교 시 동등비교(==) 연산보다 equals() 메서드 사용
		 * - 문자열을 생성하면 String 클래스 내부적으로 char[]로 관리됨
		 * 	=> 개발자의 편의를 위해 별도의 String 클래스를 만들어서 제공
		 * 	=> 배열 형태이므로 배열 인덱스와 동일한 인덱스 번호를 사용
		 * 	(첫 글자 인덱스 0번, 마지막 글자 인덱스는 문자열 길이 -1)
		 * 
		 * < String 클래스의 메서드 >
		 * - 문자열 수정, 검색, 치환 등 다양한 작업을 수행하는 메서드를 제공
		 * - String 객체는 불변 객체이므로 원본 문자열을 수정하지 않고
		 * 	각종 작업을 수행할 경우 수정된 데이터를 문자열로 새로 생성함
		 * 	=> 문자열 수정이 빈번할 경우에는 메모리 낭비가 심하므로
		 * 		StringBuilder 또는 StringBuffer 클래스를 활용해야 함
		 */
		
		String s1 = "Java Programming";
		String s2 = "               아이티윌     부산 교육센터         ";
		String s3 = "자바/JSP/클라우드";
		
		System.out.println(s1); // toString() 메서드가 생략됨
		System.out.println(s1.toString()); // 저장된 문자열을 리턴
		
		System.out.println("-----------------------------------------------------------");
		
		// length() : 문자열 길이(문자열을 분리해놓은 배열 크기) 리턴
		System.out.println("s1.length : " + s1.length());
		
		// equals() : 문자열 비교(대소문자 구별하여 비교)
		System.out.println("s1.equals('JAVA PROGRAMMING') : " + s1.equals("JAVA PROGRAMMING"));
		
		// equalsIgnoreCase() : 문자열 비교(대소문자 구별X 비교)
		System.out.println("s1.equalsIgnoreCase('JAVA PROGRAMMING') : " + s1.equalsIgnoreCase("JAVA PROGRAMMING"));
		
		// chatAt() : 특정 인덱스에 위치한 문자 1개 리턴
		System.out.println("s1.charAt(5) : " + s1.charAt(5));
		
		// substring() : 특정 범위 문자열(= 부분 문자열) 추출
		// 1) substring(int beginIndex) : 시작 인덱스부터 끝까지 문자열 추출
		System.out.println("s1.substring(5) : " + s1.substring(5));		
		// 2) substring(int beginIndex, int endIndex) : 시작 인덱스부터 끝 인덱스 -1까지 문자열 추출
		System.out.println("s1.substring(5,11) : " + s1.substring(5,11));
		// => 5번 인덱스(P)부터 11번 인덱스(m) -1한 (a)까지 추출
		
		// concat() : 문자열 결합(결합(연결)연산자 보다 연산 속도가 빠름)
		System.out.println("s1.concat('!') : " + s1.concat("!"));
		
		// indexOf() : 특정 문자 또는 문자열의 인덱스 리턴
		// => 문자열의 앞쪽(첫번째 인덱스)부터 탐색
		// => 탐색할 문자 또는 문자열이 존재하지 않을 경우 -1 리턴
		System.out.println("s1.indexOf('a') : " + s1.indexOf('a'));
		// => 앞에서부터 문자 a를 탐색하여 처음 만나는 인덱스 1 리턴
		System.out.println("s1.indexOf('x') : " + s1.indexOf('x'));
		// => -1
		
		// lastIndexOf() : 문자열 탐색 시 뒤에서부터 탐색하여 인덱스 리턴
		// => 탐색 순서를 역순으로 할 뿐, 인덱스 번호 자체가 바뀌지는 않음
		System.out.println("s1.lastIndexOf('a') : " + s1.lastIndexOf('a'));
		
		// replace() : 특정 문자 또는 문자열 치환
		// => 동일한 문자 또는 문자열이 존재할 경우 모두 치환
		System.out.println("s1.replace('a','@') : " + s1.replace('a','@'));
		
		// toUpperCase(), toLowerCase() : 알파벳 대소문자 변환 가능
		System.out.println("s1.toUpperCase() : " + s1.toUpperCase());
		System.out.println("s1.toLowerCase() : " + s1.toLowerCase());
		
		// trim() : 문자열 앞 뒤의 불필요한 공백 제거
		// => 문자열 사이의 공백은 제거하지 않음
		System.out.println("교육 기관은 " + s2.trim() + "입니다");
		
		// contains() : 문자열 포함 여부 리턴
		System.out.println("s2.contains('부산') : " + s2.contains("부산"));
		System.out.println("s2.contains('강남') : " + s2.contains("강남"));
		
		System.out.println("-----------------------------------------------------------");
		
		// split() : 특정 기준으로 문자열 분리
		// => 분리된 문자열은 배열로 관리됨
		// => 분리에 사용되는 기준 문자열을 구분자(= 분리자, Delimete) 라고 함
		// => 구분자를 지정하는 규칙은 정규표현식을 따름
		//String s3 = "자바/JSP/안드로이드";
		// => 문자열을 '/'기호를 기준으로 분리하여 배열로 관리
		String[] subjectArr = s3.split("/");
		System.out.println("subjectArr : " + Arrays.toString(subjectArr));
		
		// 만약 "." 기호를 구분자로 지정하는 경우
		// 정규표현식에서 특수기호로 사용되어 모든 문자를 구분자로 지정하게 됨
		// => 모든 문자가 분리 기준이 되어 제거 됨
		String s4 = "안녕하세요. 자바 프로그래밍입니다.";
		//String[] strArr = s4.split(".");
		//System.out.println("strArr : " + Arrays.toString(strArr));
		
		// 정규표현식 규칙에 따라 . 기호를 구분자로 지정해야 할 경우 \\. 사용		
		String[] strArr = s4.split("\\.");
		System.out.println("strArr : " + Arrays.toString(strArr));
		
		// String.format() 메서드
		// 특정 문자열을 형식 지정문자(%?)와 결합하여 형식을 갖춘 문자열로 리턴
		// => printf() 메서드와 형식 지정문자 동일
		String name = "홍길동";
		int age = 20;
		double height = 180.7;
		// 위의 세 가지 데이터를 형식 지정문자를 사용하여 출력
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f\n", name, age, height);
		
		// 위의 세 가지 데이터를 결합한 문자열을 리턴받아 저장
		String formatStr = String.format("%s, %d, %.1f\n", name, age, height);
		System.out.println("생성된 회원 정보는 " + formatStr );
		
		System.out.println("===========================================================");
		
		// toCharArray() : 문자열을 char[] 배열로 리턴
		// Arrays.toString() : 배열 내의 모든 데이터를 문자열로 결합하여 리턴
		String s5 = "admin123!";
		char[] charArr = s5.toCharArray();
		System.out.println(Arrays.toString(charArr));
	}

}
