package thread;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 멀티쓰레딩 구현 코드의 변형
		 * - 실제 프로그래밍 과정에서 더 많이 사용하는 방식
		 * - Thread 또는 Runnable의 구현체를 별도로 정의하지 않고
		 *  Thread 클래스의 생성자에 Runnable 인터페이스 객체 생성 코드를 바로 작성
		 * 	=> Runnable 인터페이스의 임시 객체 형태를 Thread 생성자에 전달
		 * 
		 * < 기본 문법 >
		 * Thread t = new Thread(new Runnable(){
		 * 		@Override
		 * 		public void run() {
		 * 			// 멀티 쓰레딩으로 구현할 코드를 기술
		 * 		}
		 * });
		 * t.start();
		 * 
		 * ----------------------------------------------------------------------------
		 * 위의 코드를 압축하여 Thread 객체도 임시 객체 형태로 정의할 경우
		 * Thread 인스턴스 생성 코드 마지막에 .start() 메서드 호출 연결
		 * new Thread(new Runnable(){
		 * 		@Override
		 * 		public void run() {
		 * 			// 멀티쓰레딩으로 구현할 코드를 기술
		 * 		}
		 * }).start();
		 * 
		 */
		
		Thread t1 = new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 100; i++) {
					System.out.println(i + " : A작업");
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 100; i++) {
					System.out.println(i +" : B작업");
				}
			}
		});
		
//		t1.start();
//		t2.start();
// ============================================================================
		
//		new Thread(new Runnable() {			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i = 0; i < 100; i++) {
//					System.out.println(i +" : A작업");
//				}
//			}
//		}).start();
//		
//		new Thread(new Runnable() {			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i = 0; i < 100; i++) {
//					System.out.println(i +" : B작업");
//				}
//			}
//		}).start();
		
		// ===================================================================
		// Runnable 인터페이스를 함수형 인터페이스다
		// 따라서 람다식으로 변형 가능하다
		new Thread(() -> {
				for(int i = 0; i < 100; i++) {
					System.out.println(i +" : A작업");
				}
			}
		).start();
		
		new Thread(() -> {
				for(int i = 0; i < 100; i++) {
					System.out.println(i +" : B작업");
				}
			}
		).start();
	}

}
