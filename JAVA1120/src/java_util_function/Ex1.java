package java_util_function;

import java.util.*;
import java.util.function.Consumer;

public class Ex1 {

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
		 * 1. Consumer 계열(소비자)
		 * - 파라미터를 받아서 소비한다
		 * - 리턴하지 않는다	
		 */
		
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);				
			}			
		}; 
		consumer.accept("Hello");
		
		System.out.println("---------------------------------------------------------");
		
//		Consumer<String> consumer2 = (String t) -> { System.out.println(t); };			
		Consumer<String> consumer2 = t -> System.out.println(t);			
		consumer2.accept("Hello2");
		
		System.out.println("---------------------------------------------------------");	
		
		Student s1 = new Student("이완용", 100);
		
//		Consumer<Student> consumer3 = new Consumer<Student>() {
//			@Override
//			public void accept(Student s) {
//				System.out.println(s.name);
//			}		
//		};
//		consumer3.accept(s1);
		
		printStudent(s1, s -> System.out.println(s.name));
		printStudent(s1, s -> System.out.println(s.score *= 1.5));
		printStudent(s1, s -> System.out.println(s.name + " : " +s.score));
		
		System.out.println("---------------------------------------------------------");	
		
		printStudent(s1, s -> {
			System.out.println(s.name);
			s.score *= 1.5;
			System.out.println(s.name + " : " +s.score);
		});

	}; 
	
	// 학생을 출력하려고 하는데 방식은 아직 미정
	// 출력방식을 전달 받음(Consumer<Student> printer)
	public static void printStudent(Student s, Consumer<Student> printer) {
		printer.accept(s);
	}
	
}

class Student {
	String name;
	double score;
	
	public Student(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}	
}
