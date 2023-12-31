package java_util_function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Ex3 {

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
		 * 3. Function 계열
		 * - 파라미터 리턴 모두 존재
		 */
		
		FunctionTest ft = new FunctionTest();
		ft.addPerson(new BiFunction<String, Integer, Person>() {

			@Override
			public Person apply(String t, Integer u) {
				// TODO Auto-generated method stub
				return new Person(t,u);
			}
		}, "원균", 40);
		
		ft.printPerson(new Function<String, String>() {

			@Override
			public String apply(String t) {
				if(ft.person.name.equals(t)) {
					return ft.person.toString();
				} else {
					return "unKnown user";
				}
			}
		}, "이순신");
		
		ft.printAge(new ToIntFunction<String>() {

			@Override
			public int applyAsInt(String value) {
				if(ft.person.name.equals(value)) {
					return ft.person.age;
				} else {
					return 0;
				}
			}
		}, "원균");
		
		System.out.println("-------------------------------------------------------------");
		
		FunctionTest ft2 = new FunctionTest();
//		ft2.addPerson(new BiFunction<String, Integer, Person>() {
//			@Override
//			public Person apply(String t, Integer u) {
//				// TODO Auto-generated method stub
//				return new Person(t,u);
//			}
//		}, "원균", 40);

		ft2.addPerson((name, age) -> new Person(name, age),"홍길동", 20);
		
//		ft2.printPerson(new Function<String, String>() {
//			@Override
//			public String apply(String t) {
//				if(ft2.person.name.equals(t)) {
//					return ft2.person.toString();
//				} else {
//					return "unKnown user";
//				}
//			}
//		}, "이순신");

		ft2.printPerson(name -> {
			if(ft2.person.name.equals(name)) {
				return ft2.person.toString();
			} else {
				return "unKnown user";
			}
		}
		, "홍길동");
		
//		ft2.printAge(new ToIntFunction<String>() {
//			@Override
//			public int applyAsInt(String value) {
//				if(ft2.person.name.equals(value)) {
//					return ft2.person.age;
//				} else {
//					return 0;
//				}
//			}
//		}, "원균");		
		
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
	
}

class FunctionTest {
	Person person;
	
	// String 과 Integer를 매개변수로 받고 Person 을 리턴하는
	// BiFunction 타입에 String, Integer를 받는 메서드 apply() 활용
	public void addPerson(BiFunction<String, Integer, Person>
	function, String name, Integer age) {
		person = function.apply(name, age);
	}
	
	// String을 파라미터로 받고 String을 리턴하는
	// Function 타입에 String 을 받는 apply() 활용
	public void printPerson(Function<String, String> function, String name) {
		System.out.println(function.apply(name));
	}
	
	// String을 파라미터로 받아 int를 리턴하는
	// ToIntFunction 타입에 applyAsInt() 활용
	public void printAge(ToIntFunction<String> function, String name) {
		System.out.println(name + "의 나이 : " + function.applyAsInt(name));
	}
}