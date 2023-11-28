package operator;

public class Ex4 {
	
	public static int factorial(int i, int total) {
		if(i == 1) return total; 
		return factorial(i - 1, i * total);
	}
	
//	public static int factorial(int i) {
//		if(i == 1) return 1; 
//		return i * factorial(i - 1);
//	}
	
	public static void main(String[] args) {
		/* 대입 연산자(=)
		 * - 우변의 데이터를 좌변의 변수에 저장
		 * -> 연산의 방향이 우 에서 좌로 진행
		 * 
		 * 확장 대입연산자(+=,-=...)
		 */
				
		int a = factorial(5,1);
		System.out.println(a);	
		
		char ch = 'A';
		//ch = ch + 3; 에러
		ch= (char)(ch + 3);
		ch+=3;
		System.out.println(ch);
		}
}
