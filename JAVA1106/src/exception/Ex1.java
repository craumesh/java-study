package exception;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 예외(Exception)
		 * - 개발자가 의도하지 않은 상황에서 발생하는 문제로 프로그램이 비정상적으로 종료됨
		 * 	=> 예외가 발생한 위치부터 아래쪽의 코드들은 실행되지 못함
		 * - 오류(Error)와 달리 심각도 낮으며, 예외 처리(Exception Handling) 를
		 * 	통해 예외 발생 시 해결책을 기술하여 비정상적인 종료를 막을 수 있음
		 * - 예외 처리를 위해 try ~ chatch 문을 사용하여 처리
		 * 	=> 예외가 발생할 것으로 예상되는 코드들을 try 블록 내에 기술하고,
		 * 		예외가 발생하면 JVM에 의해 해당 예외 객체들을 전달받아
		 * 		catch 블록 중 일치하는 타입에 대한 블록을 실행하여 예외 처리
		 * 	=> 만약 일치하는 catch 블록이 없을 경우 프로그램은 비정상 종료됨
		 * - Exception 클래스 및 하위 클래스를 사용하여 예외 처리
		 * - 컴파일 시점에서 예외 발생 여부를 체크하는 Compile Checked Exception 과
		 * 	실행 시점에서 예외 발생 여부를 알 수 있는 Complie Unchecked Exception 계열로 나뉨
		 * 	(Compile Checked Exception 계열 : IOException, SQLException 등
		 * 	Compile Unchecked Exception 계열 : RuntimeException 계열
		 * 	=> ArrayIndexOutOfBoundsException, NullPointerException 등)
		 * 
		 * < 예외 처리 기본 문법 >
		 * try {
		 * 		// 예외가 발생할 것으로 예상되는 범위의 코드
		 * 		// => 예외 발생하면 코드 아래쪽 나머지 코드 실행 X
		 * } catch(예외클래스명1 변수명) {
		 * 		// 예외클래스1에 해당하는 예외 발생 시 처리할 코드
		 * } catch(예외클래스명n 변수명) {
		 * 		// 예외클래스n에 해당하는 예외 발생 시 처리할 코드
		 * } finally {
		 * 		// 예외 발생 여부와 관계없이 무조건 실행할 코드
		 * 		// ex) DB 자원 반환, I/O 자원 반환 등
		 * }
		 */
		
		System.out.println("프로그램 시작");
		
		// RuntimeException 클래스 계열들(Compile Unchecked Exception 계열)
//		int num = 0;
//		System.out.println(3 / num);
		// => 나눗셈 연산의 피연산자가 0인 경우 ArimethicException 예외 발생
		// => java.lang.ArithmeticException : /by zero at exception.Ex.main(Ex.java:43)
		
//		int[] arr = {1,2,3};
//		System.out.println(arr[4]);
		// 배열에 존재하지 않는 인덱스 접근 시 ArrayIndexOutOfBoundsException 발생
		
//		String str = null;
//		System.out.println(str.length());
		// 객체의 주소를 참조하지 않는 참조변수(null) 접근 시 NullPointerException 발생
		
		System.out.println("프로그램 종료");
		System.out.println("==========================================================================");
		
		// 예외 처리
		
		System.out.println("프로그램 시작");
		try {
			int num = 1;
			System.out.println(3 / num);
			// 만약 이 지점에서 예외 발생 시 나머지 try 블록의 코드들은
			// 실행되지 못하고 바로 catch 문으로 이동
			
			int[] arr = {1,2,3};
			System.out.println(arr[2]);
			
			String str = null;
			System.out.println(str.length());
			// 예외가 복수개 일 때 각각의 예외를 별도로 처리해도 되지만
			// 예외도 클래스이므로 업캐스팅이 가능하므로
			// 상위 예외 타입으로 묶어서 처리 가능
			// ex) NullPointerException + ArithmeticException
			// 		= RuntimeException 또는 Exception 클래스 처리 가능
			
			System.out.println("try 블록 끝");			
			// catch 블록은 여러개 추가할 수 있으며 if 문처럼 순차 실행된다
		} catch(ArithmeticException e) {
			// ArithmeticException 예외가 발생했을 경우 처리할 코드를 기술
			// 예외가 발생하지 않을 경우 이 블록은 실행되지 않음
			e.printStackTrace();
			// => 예외 클래스, 발생 위치, 원인 등을 자세히 출력			
			
			System.out.println("0으로 나눌 수 없음 - " + e.getMessage());
			// e.getMessage() 예외 발생 원인 메세지를 문자열로 리턴
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열 인덱스 범위 초과 - " + e.getMessage());
		} catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("문자열 변수 값이 null - " + e.getMessage());
			
			// Exception 예외 처리 catch 블록이 존재할 경우
			// 해당 예외 아래쪽의 catch 블록은 실행되지 못함
			// => if문과 마찬가지로 순차적으로 처리되므로
			//		하위클래스 타입부터 상위클래스 타입순으로 예외 처리 필수
		} catch(Exception e) {
			// 위쪽의 catch 블록에서 지정되지 않은 나머지 예외들은
			// Exception 이 기술도니 catch 블록에서 모두 처리 가능함
			// => 단, 각 예외에 따른 처리 방법을 구분할 수 없음
			e.printStackTrace();
			System.out.println("나머지 모든 예외 처리 - " + e.getMessage());
		} finally {
			System.out.println("프로그램 종료");
		}		
		
	}
}
