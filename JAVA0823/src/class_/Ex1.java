package class_;

public class Ex1 {
	
	/*
	 * 객체 지향 프로그래밍 절차
	 * 1. 요구사항 분석
	 * 2. 클래스의 설계
	 * 3. 설계뙨 클래스로부터 객체 생성(인스턴스 생성)
	 * 4. 인스턴스를 통한 프로그램 구현
	 * 
	 * main() 메서드는 자바 프로그램의 시작점
	 * => main()메서드에서부터 객체를 생성하고 사용할 수 있다
	 * 단, main() 메서드에서만 가능한 것은 아니고
	 * main() 메서드가 호출하는 다른 메서드에서도 사용 가능
	 */

	public static void main(String[] args) {
		
		/*
		 * 정의한 클래스는 설계도에 해당하므로 실제 사용을 하기 위해서는
		 * 반드시 실체(객체)를 생성해야한다
		 * => 클래스를 사용하여 메모리에 생성된 객체(실체)를 만들게 되고,
		 * 	이를 인스턴스 라고 함
		 * 
		 * < 클래스에 대한 인스턴스 생성 기본 문법 >
		 * 클래스 변수명 = new 클래스명();
		 * 
		 * Animal 클래스의 인스턴스 생성*/
//		1. Animal 클래스 타입 변수 선언 
//		Animal ani;
		
//		2. Animal 클래스 인스턴스 생성 및 주소값 저장
//		ani = new Animal();
		
		Animal ani = new Animal();
		Animal ani2 = new Animal();
		
//		Animal 인스턴스에 접근하여 멤버변수 사용 및 메서드 호출
//		=> 인스턴스 접근을 위해서는 반드시 인스턴스 주소가 필요하며,
//			인스턴스 주소를 담고 있는 참조변수(ani)를 통해 접근이 가능
//		1. Animal 인스턴스의 멤버변수 name 과 age 에 값 지정
//		=> 반드시 참조변수명.멤버변수명 형태로 접근
		ani.name = "멈뭄미"; // ani 인스턴스의 멤버변수 name 에 "멈뭄미" 저장
		ani.age = 3;
		System.out.println("이름 : " + ani.name);
		System.out.println("나이 : " + ani.age);
		
//		2. Animal 인스턴스의 메서드 cry() 호출
//		=> 리턴값이 없는 메서드이므로 메서드만 호출
		ani.cry();
		
		System.out.println("---------------------------------------------");
		
		ani2.name = "야옹이";
		ani2.age = 2;
		System.out.println("이름 : " + ani2.name);
		System.out.println("나이 : " + ani2.age);
		ani2.cry();
		
		System.out.println("---------------------------------------------");
		
//		--------------------------------------------------------
//		위의 두 인스턴스(ani, ani2) 구조
//		--------------------------------------------------------
//		new
//		Animal 클래스 => 	인스턴스1(ani)	인스턴스2(ani2)
//		이름(name)			"멍멍이"		"야옹이"
//		나이(age)			"3"				"2"
//		--------------------------------------------------------
		
		Car car = new Car();
		
		car.company = "현대";
		car.modelName = "그랜져";
		car.cc = 3000;
		System.out.println("제조사 : " + car.company + "\n모델명 : " + car.modelName + "\n배기량 : " + car.cc);
		car.speedUp();
		car.speedDown();
		
		System.out.println("---------------------------------------------");
		
		Student s1 = new Student();
		
		s1.name = "홍길동";
		s1.id = 1;
		s1.subjectName = "JAVA";
		s1.className = "클라우드 융합 자바 스프링 백엔드 개발자";
		
		System.out.printf("이름 : %s\n아이디 : %d\n수강 강좌명 : %s\n", s1.name, s1.id, s1.className);
		s1.study(s1.subjectName);
		s1.rest();
		
	}
}

//하나의 java 파일 내에 여러 개의 클래스를 정의할 수 있다
//=> 단 파일명과 동일한 이름의 클래스 외에는 public 키워드를 붙일 수 없다.
//학생(Student) 클래스 정의
//속성 : 이름, 번호, 과정명

class Student {
	String name;
	int id;
	String subjectName;
	String className;
		
	public void study(String subjectName) {
		System.out.println(subjectName + " 과목 공부!");
	}
	
	public void rest() {
		System.out.println("휴식!");
	}
}
