package method_overloading;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 메서드 오버로딩 문제점
		 * - 동일한 작업을 수행하는 코드들의 중복이 발생!
		 * 	=> 만약, 특정 메서드의 코드를 수정해야 할 경우
		 * 		동일한 코드를 여러 번 수정해야하는 번거로움이 발생할 수 있음
		 * 	=> 코드의 유지보수성이 나쁘다!
		 * 
		 * [ 해결책 ]
		 * - 오버로딩 된 메서드에서 또 다른 오버로딩 된 메서드를 호출하여
		 * 	중복되는 작업을 대신 처리하도록 할 수 있다!
		 * 	=> 메서드 호출 시 자신의 전달받은 파라미터를 다시 전달
		 * 	=> 이처럼 클래스 내의 다른 메서드를 호출하여 사용 = 코드의 재사용
		 */
		
		PrintClass pc = new PrintClass();
		
		pc.print();
		System.out.println();
		pc.print("홍길동");
		System.out.println();
		pc.print("홍길동", "이순신");
		System.out.println();
		pc.print("홍길동", "이순신", "강감찬");
		System.out.println();
		
	}
}

class PrintClass {
	public void print() {
		System.out.println("print() 메서드 호출됨!");
//		System.out.println("초대멤버 : 없음 없음 없음");
		print("없음", "없음", "없음");
	}
	
	public void print(String p1) {
		System.out.println("print(String) 메서드 호출됨!");
//		System.out.println("초대멤버 : " + p1 + " 없음 없음");
		print(p1, "없음", "없음");
	}
	
	public void print(String p1, String p2) {
		System.out.println("print(String, String) 메서드 호출됨!");
//		System.out.println("초대멤버 : " + p1 + " " + p2 + " 없음");
		print(p1, p2, "없음");
	}

	public void print(String p1, String p2, String p3) {
		System.out.println("print(String, String, String) 메서드 호출됨!");
		System.out.println("초대멤버 : "  + p1 + " " + p2 + " " + p3);
	}
	
	// 주의! 모든 파라미터를 전달받는 마지막 메서드는
	// 자기 자신을 호출하지 않고 반드시 직접 작업을 수행해야 한다!
	// 순환 호출		
}
