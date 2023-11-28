package super_;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 메서드 오버라이딩 및 멤버변수에 대한 오버라이딩 시
		 * 슈퍼클래스의 멤버변수와 메서드는 은닉되어 보이지 않게 됨
		 * => 즉, 서브클래스의 인스턴스를 통해 슈퍼클래스의 멤버에 접근 불가능
		 * 
		 * < 레퍼런스 super >
		 * - 슈퍼클래스의 멤버에 접근하기 위한 키워드(= 레퍼런스 변수)
		 * - 레퍼런스 this 와 마찬가지로 서브클래스 인스턴스를 생성할 때 생성되며
		 * 	이 때 자동으로 생성되는 슈퍼클래스의 인스턴스 주소를 저장하는 변수
		 * - 주로 오버라이딩에 의해 은닉된 멤버변수 또는 메서드 접근 시 사용
		 * - 기본 문법 : super.부모의 멤버변수 또는 super.부모의 메서드()
		 */
		
		Child c = new Child();
		System.out.println("우리집 TV : " + c.TV);
		System.out.println("=============================================================");
		c.watchTV();
		System.out.println("=============================================================");
		// 레퍼런스 super를 통해 슈퍼클래스의 멤버에 접근한 메서드 호출
		c.watchParenTV();
		System.out.println("=============================================================");
		ChildClass cc = new ChildClass();
		cc.method();
		
		
	}

}

class Parent {
	String TV = "부모님이 구입한 TV";
	
	public void watchTV() {
		System.out.println("부모님 집에서 " + TV +" 보기!");
	}
}

class Child extends Parent {
	// 슈퍼클래스로부터 상속받은 멤버변수와 동일한 이름의 변수를 선언하면
	// 슈퍼클래스의 멤버변수는 은닉됨
	String TV = "내가 구입한 TV";

	
	// 슈퍼클래스로부터 상속받은 watchTV() 메서드 오버라이딩
	// 슈퍼클래스의 메서드는 은닉됨
	@Override
	public void watchTV() {
		System.out.println("서브클래스에서 오버라이딩 된 watchTV() 메서드");
		System.out.println("독립한 나의 집에서 " + TV +" 보기!");
	}
	
	public void watchParenTV() {
		// 현재 클래스 내에서 오버라이딩으로 인해 은닉된 슈퍼클래스의 멤버는
		// 레퍼런스 super를 통해 접근하면 사용이 가능하다
		// => 레퍼런스 this와 사용 방법이 동일함
		// 1. 슈퍼클래스의 은닉된 멤버변수에 접근할 때
		System.out.println("부모님댁 TV : " + super.TV);
		System.out.println("우리집 TV : " + this.TV);
		
		// 2. 슈퍼클래스의 은닉된 메서드에 접근할 때		
		super.watchTV();
	}
	
}

// =========================================================================================
/*
 * 슈퍼클래스와 서브클래스 존재 시
 * 서브 클래스의 메서드 내에 동일한 이름의 변수가 존재할 때 탐색 과정
 * - 메서드 내에서 접근할 변수 종류 : 로컬변수, 자신의 멤버변수, 부모의 멤버변수
 * - 메서드 내에서 접근 순서
 * 	로컬변수 -> 서브클래스 멤버변수 -> 슈퍼클래스 멤버변수
 * - 최종적으로 Object 클래스까지 거슬러 올라가면서 탐색하며 없으면 오류 발생
 */

class ParentClass {
	String x = "Parent"; // 슈퍼클래스의 멤버변수
}

class ChildClass extends ParentClass {
	String x = "Child"; // 서브클래스의 멤버변수
	public void method() {
		String x = "Method"; // 로컬변수
		
		System.out.println("x = " + x);
		// => 로컬변수를 선언하지 않을 경우 this.x와 동일
		
		System.out.println("this.x = " + this.x); // 서브클래스 멤버변수 x
		// => Child 클래스 멤버변수를 선언하지 않을 경우 super.x와 동일
		
		System.out.println("super.x = " + super.x); // 슈퍼클래스의 멤버변수 x
		// => Parent 클래스 멤버변수를 선언하지 않을 경우 에러 발생
		// => Parent 클래스의 슈퍼클래스인 Object 클래스에 존재하지 않는 멤버이므로
	}
}

