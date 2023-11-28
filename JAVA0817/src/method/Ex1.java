package method;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 메서드(Method)
		 * - 동작(작업)의 최소 단위(= 작업을 수행하는 코드들의 모음)
		 * ex) "밥먹다"의 기능을 메서드로 표현(밥을 떠서 입에 넣고 씹기 등)
		 * - 반드시 호출 되어야만 실행될 수 있음
		 * 	=> 호출하는 메서드 : Caller, 호출 당하는 메서드 : Worker
		 * - 메서드 호출 시 메서드에 전달하는 값을  전달 인자(Argument)라고 하며,
		 *	이 전달 인자를 전달받아 저장하는 변수를 매개변수(Parameter)라고 함
		 *	=> 파라미터는 있을 수도 있고, 없을 수도 있음
		 * - 메서드가 호출되면 작업을 수행한 후에 반드시 호출한 위치로 돌아감
		 * 	=> 이 때, 호출한 곳으로 전달하는 값을 리턴값이라고 함
		 * - 리턴타입을 명시한 메서드는 반드시 return 문을 사용하여 데이터를 리턴
		 * 	=> 단, 리턴 타입이 void 인 메서드는 return 문을 생략해도 되고
		 * 	리턴값 없이 return 문만 기술할 수 있다.
		 *	=> 메서드 내에서 return 문을 만나면 즉시 메서드를 종료하고 돌아감
		 *	=> if 문 등의 조건식을 사용하여 return 문을 실행할 경우
		 *	반드시 어떤 경우에도 return 문이 실행되도록 조건식을 작성해야함
		 * - main() 메서드는 자바에서 유일하게 호출하지 않아도
		 * 	프로그램 실행 시점에서 자동으로 호출되는 메서드
		 * 	=> main() 메서드를 자바 프로그램의 시작점 이라고 함
		 * - 메서드 호출 시 메서드 매개변수와 일치하는 타입 및 개수의
		 *	데이터 전달이 필수
		 *
		 */
		
		functiooooon1(); // 1
		functiooooon2(); // 2
	}	
	public static void functiooooon1(){}
	public static int functiooooon2(){return 0;}
	

}
