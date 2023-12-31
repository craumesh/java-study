package anonymous;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonyClass ac = new AnonyClass();
		ac.member.start();
		ac.method1();
		ac.method2(new Worker() {
			@Override
			public void start() {
				System.out.println("테스트를 합니다!");
			}
		});
	}

}

class Worker {
	public void start() {
		System.out.println("시작합니다!");
	}
}

class AnonyClass {	
	Worker member = new Worker() {
		public void start(){
			System.out.println("디자인을 합니다!");
		}
	};
	
	public void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니다!");
			}	
		};
		localVar.start();
	}		
	
	public void method2(Worker member) {
		member.start();
	}
}