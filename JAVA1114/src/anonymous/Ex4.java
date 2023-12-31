package anonymous;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 익명 객체의 로컬 변수 사용
		 * - 메서드의 매개변수나 로컬변수를 익명 객체 내부에서 사용할 때 제한이 있음
		 * - 익명 객체는 메서드 실행이 종료되면 없어지는 것이 일반적이지만
		 * 	메서드가 종료되어도 계속 실행 상태에 존재할 수 있음
		 * 	(ex. 익명 쓰레드 객체 사용)
		 * - 메서드의 매개변수나 로컬변수를 익명 객체 내부에서 사용할 때 매개변수나
		 * 	로컬변수는 메서드 실행이 끝나면 스택(Stack) 메모리에서 사라지기 때문에
		 * 	익명 객체에서는 지속적으로 사용할 수 없음
		 * - 이런 문제를 해결하기 위해 자바는 컴파일 시 익명 객체에서 사용하는
		 * 	매개변수나 로컬변수의 값을 익명 객체 내부에 복사해두고 사용한다
		 * - 매개변수나 로컬변수가 수정되어 갑싱 변경되면 수정된 값과
		 * 	익명 객체에 복사해둔 값이 달라지게 되어 매개변수나 로컬변수를 final 로
		 * 	선언할 것을 요구한다
		 * - 자바 7 이전까지는 final 키워드 없이 선언된 매개변수나 로컬변수를
		 * 	익명 객체에서 사용 시 컴파일 에러가 발생 했었다
		 * 	(자바 8부터는 final 키워드 없이 선언된 매개변수나 로컬변수 사용 시
		 * 	에러 발생하지 않는다)
		 * - final 선언을 하지 않아도 수정될 수 없도록 final의 특성을 부여한다
		 */
		
		AnonymousClass2 ac = new AnonymousClass2();
		ac.method(0, 0);
	}

}

interface Calculatable {
	public int sum();
}

class AnonymousClass2 {
	private int num;
	
	public void method(final int arg1, int arg2) {
		final int num1 = 0;
		int num2 = 0;
		
		num = 10; // 인스턴스 멤버 변수의 값은 변경 가능
//		arg1 = 20;
//		arg2 = 20;
		
//		num1 = 30;		
//		num2= 30;
		
		Calculatable cal = new Calculatable() {
			
			@Override
			public int sum() {
				int result = num + arg1 + arg2 + num1 + num2;
				// => 익명 객체에서 매개변수값 또는 로컬변수 사용 시 값을 변경이 있으면 에러 발생
				// => 따라서 익명 객체 사용 전 값을 변경하는 부분이 존재해서는 안 된다
				return result;
			}
		};
		System.out.println(cal.sum());
	}
}