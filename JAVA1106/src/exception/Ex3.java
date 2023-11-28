package exception;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 예외 처리 위임(전달)
		 * - 예외가 발생한 곳에서 try ~ catch 블록으로 직접 처리할 수 있지만
		 * 	자신이 직접 처리하지 않고, 메서드 호출한 곳으로 예외 위임 가능
		 * - throws 키워드를 사용
		 * - 예외 처리를 위임받은 메서드는 다시 예외 처리에 대한 책임이 발생하며
		 * 	직접 처리하거나 또 다른 곳으로 위임 가능
		 * - 최종적으로 마지막 단계의 메서드에서는 try ~ catch 블록을 사용하여
		 * 	예외를 직접 처리해야 함(ex. main() 메서드)
		 * - throws 키워드를 사용하여 지정하는 예외는 1개 또는 복수개 지정 가능
		 * 
		 * < 예외 위임 기본 문법 >
		 * - 메서드 정의 시 메서드 선언부 마지막에 throws 키워드를 쓰고
		 * 	뒤에 예외를 위임할 클래스명을 기술(복수개일 경우 콤마로 구분)
		 * [접근제한자] 리턴타입 메서드명([파라미터...]) throws 예외클래스명... {
		 * 		// 예외가 발생하는 코드...
		 * }
		 */
		
		// 팀장으로부터 위임받을 때, 현재 메서드가 사장(main())일 경우
		// 더 이상 위임할 수 있는 곳이 없음(문법적으로는 throws로 해결은 가능)
		// => 따라서 최종적으로 사장(main())이 모든 예외를 처리하는 것을 권장
		try {
			팀장();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("팀장이 모든 예외 처리");
		}
	}
	
	public static void 팀장() throws Exception {
//		try {
//			대리();	
//			System.out.println("팀장이 대리의 예외 처리");
//		} catch(RuntimeException e) {
//			System.out.println("팀장이 직접 예외 처리");
//		} catch(ClassNotFoundException e) {
//			System.out.println("팀장이 직접 예외 처리");
//		}
		
		// 팀장이 위임받은 예외를 사장(main()) 에게 위임하는 경우
		// => RuntimeException과 ClassNotFoundException
	}
	
	public static void 대리() throws RuntimeException, ClassNotFoundException {
//		try {
//			사원1();
//			사원2();
//			System.out.println("대리가 사원의 예외 처리");
//		} catch(ArithmeticException e) {
//			System.out.println("대리가 직접 예외 처리");
//		} catch(NullPointerException e) {
//			System.out.println("대리가 직접 예외 처리");
//		} catch(ClassNotFoundException e) {
//			System.out.println("대리가 직접 예외 처리");
//		}
		
		// 2. 예외를 위임받은 대리도 팀장에게 다시 위임하는 경우
		// => 발생 가능성이 있는 예외 클래스를 모두 throws 키워드 뒤에 명시
		// => 모든 클래스를 따로 명시하거나, 상위 타입으로 결합하여 명시 가능
		사원1();
		사원2();
	}
	
	public static void 사원1() throws RuntimeException {
		// 예외 처리 방법
		// 1. 예외가 발생한 곳에서 try ~ catch 로 직접 예외 처리
		try {
//			System.out.println("사원에서 예외 발생");
//			System.out.println(3/0);
			
			String str = null;
			System.out.println(str.length());
		} catch(ArithmeticException e) {
			System.out.println("사원1이 직접 예외 처리");
		} catch(NullPointerException e) {
			System.out.println("사원1이 직접 예외 처리");
		}
		
		// 2. 메서드를 호출한 곳으로 throws 키워드로 예외를 위임
		// => 현재 사원() 메서드를 호출한 곳(대리()) 으로 예외를 던짐
		System.out.println("사원1에서 예외 발생");
		System.out.println(3/0);
	}
	
	public static void 사원2() throws ClassNotFoundException {
		System.out.println("사원2에서 예외 발생");
		Class.forName(""); // ClassNotFoundException
		// => Unhandled exception type ClassNotFoundException
		// => Compile Checked Exception 이므로 예외 처리가 필수
	}

}
