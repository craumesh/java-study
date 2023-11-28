package method;

public class Test3 {
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int operator(String oper, int num1, int num2) {		
		return oper == "+" ? num1 + num2 : num1 - num2;
	}

	public static void main(String[] args) {
		Test3 testMethod = new Test3();
		int num1 = 10, num2 = 20;
		
//		System.out.printf("%d + %d = %d",num1 , num2, testMethod.sum(num1, num2));
		System.out.println(testMethod.operator("-", num1, num2));
	}

}
