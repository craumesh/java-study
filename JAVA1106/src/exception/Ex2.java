package exception;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * finally 블록
		 * - 예외 발생 여부와 관계없이 무조건 수행해야하는 문장을 기술
		 * - 심지어 return 문을 만나 메서드를 종료하더라도 호출한 곳으로 돌아가기 전
		 * 	finally 블록을 실행한 후 돌아감
		 */
		
		System.out.println("프로그램 시작");
		try {
			String str = null;
			System.out.println(str.length());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally - 예외 발생 여부와 관계 없이 실행");
		}
	
		System.out.println("프로그램 종료");
		
		System.out.println("----------------------------------------------------------");
		
		method1();
	}
	
	
	
	public static void method1() {
		System.out.println("메서드 시작");
		
		System.out.println("프로그램 시작");
		try {
			String str = null;
			System.out.println(str.length());
			
			return; // 메서드 종료 후 호출한 곳으로 되돌아감
			// => finally 블록이 존재할 경우 호출한 곳으로 돌아가기 전
			// 		finally 블록을 실행한 후 돌아감
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally - 예외 발생 여부와 관계 없이 실행");
		}
	}

}
