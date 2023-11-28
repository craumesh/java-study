package method;

public class Test {
	
//	1. 매개변수 X && 리턴 X
	
	public void printHello() {
		String s = "Hello, World!\n";
		System.out.println(s.repeat(10));
	}
	
	public void printGugudan() {
		for(int i = 2; i < 10; i++) {
			System.out.printf("[%d단]\n", i);
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.printf("\n");
		}		
	}
	
//	2. 매개변수 X && 리턴 O
	
	public String printHello2() {
		String s = "Hello, World!\n";
		return s.repeat(10);
	}	
	
	public int sum() {
		int num = 0;
		for(int i = 1; i <= 10; i++) {
			num += i;
		}
		return num;		
	}	
	
	public String getWeather() {
		String todayWeather = "흐림";
		return todayWeather;
	}

	public static void main(String[] args) {
		Test testMethod = new Test();
//		testMethod.printHello();
//		testMethod.printGugudan();
//		System.out.println(testMethod.printHello2());
		System.out.println(testMethod.sum());
		System.out.println(testMethod.getWeather());
//		testMethod.printHello3(10, "Hello, World!\n");
//		System.out.println(testMethod.printHello4(10, "Hello, World!\n"));
	}

}
