package lambda;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 익명 객체를 생성하는 람다식
		 * - 자바는 객체 지향 언어로 객체 없이 메서드를 호출할 수 없다
		 * - 람다식은 객체 없이 인터페이스의 구현만으로 메서드를 호출할 수 있는데
		 * 	그 이유는 익명 내부 클래스에 있다
		 * - 익명 내부 클래스는 클래스 이름 없이 인터페이스 자료형 변수에
		 * 	바로 메서드 구현부를 생성하여 대입할 수 있다
		 * - 즉 람다식으로 메서드를 구현해서 호출하면 컴퓨터 내부에서는
		 * 	익명 클래스가 생성되고, 이를 통해 익명 객체가 생성 되는 것
		 */
		
		Str concat = new Str() {
			@Override
			public String link(String x, String y) {
				return x+""+y;
			}
		};
		
		System.out.println(concat.link("안녕", "하세요!"));
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 람다식에서 사용하는 지역 변수
		 * - 람다식 코드에서는 외부 메서드의 지역 변수를 수정할 수 없음
		 * 	그 이유는 지역 변수는 메서드 호출이 끝나면 메모리에서 사라지기 때문에
		 * 	익명 내부 클래스에서 사용하는 경우에는 지역 변수가 상수로 변하기 때문
		 */
		
		int i = 100; // main() 메서드의 지역변수
		
		Str concat2 = (s, v) -> {
//			i = 200; // main() 메서드의 지역변수 i는 상수(final) 이므로 값 변경 불가 
			return s + v;
		};
		System.out.println(concat2.link("안녕!!!", "하세요!!!"));
		
	}
}


