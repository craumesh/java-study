package constructor;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 생성자(Constructor)
		 * - 클래스를 사용하여 인스턴스를 생성할 때 호출되는 메서드 형태
		 * 	=> new 키워드 뒤에 생성자 호출 코드가 기술됨
		 * - 주로 인스턴스 변수를 초기화하는 용도 또는
		 * 	인스턴스 생성 시 초기에 수행할 작업을 기술하는 용도
		 * - 메서드 형태와 유사하나 차이점 두 가지 존재
		 * 	1) 선언부에 리턴타입이 없음
		 * 	(리턴값이 없는 것이 아니라 리턴타입 자체를 기술하지 않음)
		 * 	2) 생성자 이름이 클래스 이름과 동일함
		 * - 개발자가 클래스 정의 시 생성자를 하나도 정의하지 않으면
		 * 	컴파일러에 의해 자동으로 기본(Default) 생성자가 생성됨
		 * - 메서드와 유사한 형태이므로 파라미터가 있을 수도 있고, 없을 수도 있음
		 * - 생성자를 별도로 호출 할 수 없으며, 반드시 new 키워드 뒤에만 지정할 수 있음
		 * < 생성자 정의 기본 문법 >
		 * [접근제한자] 메서드명([매개변수선언...]){
		 * 	// 생성자 호출 시점(인스턴스 생성 시점)에 수행할 작업을 기술
		 *	// => 인스턴스 변수 초기화 등
		 * }
		 * 
		 * < 인스턴스 생성 기본 문법 >
		 * 클래스명 참조변수명 = new 생성자명([데이터...])
		 * 
		 */
		
//		System.out.println("Person 인스턴스 생성전!");
		
//		Person p = new Person();
		// => new 키워드에 의해 인스턴스가 생성될 때
		//	Person() 형태의 생성자를 자동으로 호출하게 된다
		
//		p.Person(); // 주의! 생성자를 별도로 호출할 수 없다!
		
//		Person p = new Person();
//		System.out.println("이름 : " + p.name + "\n나이 : " + p.age);
		
		Person p = new Person();
		p.printInfo();
		
		System.out.println();
		
		Person p2 = new Person("이순신", 999);
		p2.printInfo();
		
	}
}

class Person {
	private String name;
	private int age;
	
	// 클래스 정의 시 개발자가 별도의 생성자를 정의하지 않으면
	// 자바 컴파일러에 의해 기본 생성자가 자동으로 생성됨.
	// => 기본 생성자는 접근제한자가 클래스와 같고,
	//	리턴타입이 없으며, 이름은 클래스 이름과 같다.
	//	또한, 매개변수가 없으며 중괄호 블록{} 내에 수행할 코드가 없다.
//	public Person() {} // 기본 생성자(Default Condstructor)
	
//	public Person() {
//		// 기본 생성자 내부에서 실행 확인
//		System.out.println("생성자 Person 호출됨!");
//	}
	
	public Person() {
//		System.out.println("생성자 Person 호출됨!");
		// 인스턴스 변수(멤버변수) name 에 "홍길동" 저장, age 에 20 저장
		name = "홍길동";
		age = 20;
	}
	
	
	public Person(String sName, int iAge){
		this.name = sName;
		this.age = iAge;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}
	
}
