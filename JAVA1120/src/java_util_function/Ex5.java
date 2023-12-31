package java_util_function;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바에서 제공하는 함수형 인터페이스
		 * java.util.function 패키지
		 * 
		 * 				파라미터	리턴
		 * Consumer 계열	O		 X
		 * Supplier	계열	X		 O
		 * Function 계열	O		 O
		 * Operator	계열	O		 O
		 * Predicate계열	O		 boolean
		 * 
		 * 5. Predicate 계열
		 * - Function, Operator와 같이 파라미터와 리턴을 갖는다
		 * - 리턴타입이 boolean으로 고정되어 있음
		 * - 매개변수를 전달받아 "어떠한 연산" 후 true/false 를 리턴할 때 사용
		 */
		
		// 익명 객체 활용
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.contains("Java");
			}
		};
		
		Predicate<String> predicate2 = str -> str.contains("Java");
		
		System.out.println(predicate.test("JavaScript"));
		System.out.println(predicate2.test("JavaScript"));
		
		System.out.println("---------------------------------------------------");
		
		PredicateTest pt = new PredicateTest();
		pt.printSome(new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value % 3 == 0;
			}
		});
		
		System.out.println("---------------------------------------------------");
		
		pt.printSome(num -> num % 3 == 0);
		pt.printSome(num -> num > 5);
		
	}
}

class PredicateTest {
	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public void printSome(IntPredicate pred) {
		for(int num : nums) {
			if(pred.test(num)) {
				System.out.println(num + "\t");
			}
		}
	}
}