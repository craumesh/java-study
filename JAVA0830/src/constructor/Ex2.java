package constructor;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 파라미터 생성자
		 * - 생성자 호출 시점에서 전달해야할 데이터가 있을 경우
		 * 	생성자 파라미터(매개변수)를 선언할 수 있음(= 메서드와 동일)
		 * - 전달받은 데이터는 인스턴스 변수를 초기화하는 용도로 사용
		 * - 즉, 객체마다 다른 데이터를 가진 채로 인스턴스를 생성하기 위해 사용
		 * 
		 * < 파라미터 생성자 정의 기본 문법 >
		 * [접근제한자] 클래스명(매개변수선언...){
		 * 		// 생성자 호출 시점에 파라미터에 데이터를 전달하여
		 * 		// 인스턴스 내의 인스턴스 변수(멤버변수)를 초기화함
		 * 		인스턴스변수명(멤버변수명) = 매개변수명(데이터)
		 * }
		 * 
		 * => 파라미터 생성자 자동 생성 단축키 : Alt + Shift + S -> O
		 * 	(단, )
		 */
		
		// Person2 인스턴스 생성
//		Person2 p1 = new Person2();
		// => 오류 발생!
		// => 파라미터 생성자를 하나라도 정의할 경우
		//	컴파일러에 의해 기본 생성자가 자동으로 생성되지 않기 때문에
		//	기본 생성자를 호출할 수 없게 된다
		// => 해결책 : 기본 생성자를 직접 정의하던지
		//			Person2(String, int) 파라미터 생성자로 인스턴스 생성!
		
		Person2 p2 = new Person2("단군",999);
		p2.printInfo();
		
		System.out.println();
		
		Person2 p3 = new Person2("환국","단군",999);
		p3.printInfo();
	}
}

class Person2 {
	//멤버변수 선언(= 인스턴스 변수, 필드)
	private String nation;
	private String name;
	private int age;
	
	public Person2(String sName, int iAge) {		
		name = sName;
		age = iAge;
		
		// 만약 변수값을 무조건 특정값으로 고정하고 싶을 경우
		// 별도로 파라미터 값을 전달받지 않고 생성자 내에서 초기화		
		nation = "대한민국";		
	}	

	public Person2(String nation, String name, int age) {
		super();
		this.nation = nation;
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		System.out.printf("소속 국가 : %s\n이름 : %s\n나이 : %d\n", nation, name, age);
	}
}
