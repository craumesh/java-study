package anonymous;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousClass ac = new AnonymousClass();
		ac.vc.run();
		ac.method2();
		ac.method4(new Vehicle() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("트럭이 달립니다!");
			}
		});
	}

}

interface Vehicle {
	void run();
}

class AnonymousClass {
	
	void method1(Vehicle vc) {};
	
	void method2() {
		Vehicle vc = new Vehicle() {		
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("승용차가 달립니다!");
			}
		};
		vc.run();
	}
	
	void method3() {
		method1(new Vehicle() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("트럭이 달립니다!");
			}
		});
	}
	
	void method4(Vehicle vc) {
		vc.run();
	}
	
	Vehicle vc = new Vehicle() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("자전거가 달립니다!");
		}
	};	
	
}