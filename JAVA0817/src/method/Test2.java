package method;

public class Test2 {
	
//	3. 매개변수 O && 리턴 X
	
	public void printHello3(int repeatNum, String repeatStr) {
		System.out.println(repeatStr.repeat(repeatNum));
	}
	
	public void print(String strItwill) {
		System.out.println(strItwill);
	}
	
	public void checkNum(int num) {
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
	}

//	4. 매개변수 O && 리턴 O
	
	public String printHello4(int repeatNum, String repeatStr) {
		return repeatStr.repeat(repeatNum);
	}
	
	public String checkNum2(int num) {
		return num % 2 == 0 ? "짝수" : "홀수";
	}
	
	
	
	public static void main(String[] args) {
		Test2 testMethod = new Test2();
		
//		testMethod.print("아이티윌 부산교육센터");
//		testMethod.checkNum(3);
		System.out.println("판별 결과 : " + testMethod.checkNum2(2));
	}

}
