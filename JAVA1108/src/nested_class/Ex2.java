package nested_class;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer = new Outer2();
		outer.method();
	}
}

class Outer2 {
	private int num = 10; // 인스턴스 멤버변수
	
	public void method() {
		
//		LocalInner localInner = new LocalInner();
		// => 로컬 내부클래스 접근은 클래스 정의보다 하단에 있어야함
		
//		public int num2 = 20;
		// => 로컬 변수에서는 접근제한자 사용 불가
		//	=> 외부에서 접근이 불가능하므로 접근제한자가 의미가 없음
		
//		static int num3 = 30;
		// => 로컬 변수에서는 스테틱 키워드 사용 불가
		
		// 로컬 내부클래스 정의
		// => 메서드 내에서 정의하며, 특정 메서드에서만 사용 가능한 클래스
		// => 로컬 변수와 마찬가지로 접근제한자 사용 불가
//		static class LocalInner {
		class LocalInner {
			String name = "LocalInnerClass"; // 로컬 내부 클래스의 인스턴스 변수
//			static int staticMember;
			// => 로컬 내부클래스에서는 정적 변수를 선언할 수 없음			
//			public static void staticMethod() {}
			// => 마찬가지로 로컬 내부 클래스에서는 정적 메서드 또한 선언 불가
			
			public LocalInner() {
				System.out.println("LocalInner() 생성자 호출됨");
			}
			
			public void print() {
				System.out.println("로컬 내부클래스의 인스턴스 멤버 메서드");
			}
		}
		
		// 로컬 내부 클래스의 인스턴스 생성(일반 클래스처럼 사용 가능)
		// => 로컬 내부 클래스는 메서드 내부에서 객체를 생성하고 사용해야함
		LocalInner localInner = new LocalInner();
		System.out.println(localInner.name);
		
	}
}
