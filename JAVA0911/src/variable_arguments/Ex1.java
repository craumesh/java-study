package variable_arguments;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 가변형 인자 = 비정형 인자(Variable Arguments)
		 * - 메서드 파라미터를 하나의 인자만 사용하여 다양하게 전달받는 기능
		 * - 동일한 타입의 파라미터를 0개 ~ 무한대로 전달받아 배열로 관리
		 * 	=> 전달받는 인자(데이터)의 개수에 따라 자동으로 배열 생성됨
		 * - 메서드 파라미터(매개변수) 선언 시 데이터 타입 뒤에 ... 기호를 표기
		 * 	ex) public void add(int... nums) {}
		 * - 가변 인자를 사용한 메서드 대표적인 예 : printf() 메서드
		 * 	=> System.out.printf(String str, Object... objs)
		 * - 다른 파라미터와 가변 인자를 조합 가능
		 * - 단, 가변 인자는 마지막 파라미터로 단 한번만 조합 가능
		 */
		NormalArguments na = new NormalArguments();
		na.print("d");
		na.print("d", "a");
		na.print("a", "e", "z");
		
		// 만약 배열을 파라미터로 사용하는 경우
		// 데이터 개수에 제한을 받지 않지만 배열을 미리 생성해야 한다
		String[] strArr = {"a", "b", "c"};
		na.print(strArr);
		
		System.out.println("=============================================================");
		
		VariableArguments va = new VariableArguments();
		// VariableArguments 객체(인스턴스)의 print() 메서드를 호출하면
		// 파라미터로 0개 ~ 무한개의 문자열 데이터 전달이 가능함
		va.print();
		va.print("a", "b", "c", "d", "e", "f", "g", "h");
		
		va.print2(2, "변상수", "이진수");
	}

}

class NormalArguments {
	// 가변 인자를 사용하지 않은 메서드 오버로딩
	// print() 메서드 오버로딩
	// String 타입 변수(name)를 통해 이름을 1개 ~ 3개 전달받아 출력
	
	public void print(String name1) {
		System.out.println(name1);
	}
	
	public void print(String name1, String name2) {
		System.out.println(name1 + " " + name2);
	}
	
	public void print(String name1, String name2, String name3) {
		System.out.println(name1 + " " + name2 + " " + name3);
	}
	
	public void print(String[] name1) {
		for(int i = 0; i < name1.length; i++) {
			System.out.print(name1[i] + " ");
		}
		System.out.println();
	}	
}

class VariableArguments {
		// 가변 인자를 사용한 메서드 오버로딩
		// print() 메서드 오버로딩
		// String 타입 변수(name)를 통해 이름을 1개 ~ 3개 전달받아 출력 
	
	public void print(String... names) {
		// String 타입 데이터를 0~무한대로 전달받을 수 있으며
		// 전달된 데이터는 자동으로 배열 생성 후 저장됨
		// => 가변인자를 사용한 변수 names는 String[] 타입으로 사용됨
		//	따라서, 배열 접근 방법을 활용하여 배열 내의 모든 요소에 접근
		// for 문을 사용하여 배열 내의 모든 데이터 출력
		
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}
	
	// 다른 파라미터와 가변 인자 조합 가능
	public void print2(int num, String...names) {
		// => int 형 데이터 1개와 문자열 데이터 여러 개를 전달 가능
		//	ex) print2(2, "홍길동", "이순신");
		System.out.println(num + " " + Arrays.toString(names));
	}
	
	// 가변 인자가 다른 파라미터보다 앞에 올 수 없다
//	public void print3(String...names, int num) {}
	
	// 가변 인자가 두개 이상 올 수 없다
//	public void print3(String...names, int... num) {}
	
}
