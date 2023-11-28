package type_conversion;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte < short < int < long < float < double
		// (    char    )
		/* 1. 자동 형변환(묵시적 형변환 = 암시적 형변환)
		 * - 작은 데이터 타입을 큰 데이터 타입으로 변환
		 * - 컴파일러에 의해 자동으로 변환
		 * - 정수보다 실수 타입이 데이터가 큼, 메모리 크기가 long이 float보다 크더라도 float 타입으로 변환
		 * 2. 강제 형변환(명시적 형변환)
		 * - 큰 데이터 타입을 작은 데이터 타입으로 변환
		 * - 오버플로우 발생 가능, 따라서 자동 형변환 방식으로 실행 시 오류 발생
		 * - 형변환 연산자를 사용하여 수행
		 * - 오버 플로우에 의해 데이터가 변조 될 수 있다
		 * - 
		 */
		
		int a1 = 31234;
		short a2 = 31234;
		float a3 = 31234.31234f;
		String a4 = "";
		
		System.out.println("변환전 a1(int) : " + a1 + " -> a2(short) : " + a2);
		System.out.printf("변환전 a1(int) : %d -> a2(short) : %d\n", a1, a2);
		System.out.printf("변환전 a3(float) : %f -> a3(int) : %d\n", a3, (int)a3);
		//int -> String : Integer.toString() = String.valueOf() = (int) + ""
		System.out.printf("변환전 a1(int) : %d -> a4(String) : %s\n", a1, a4 = a1 + "");
		//String -> int : Integer.parseInt() = Integer.valueOf()
		System.out.printf("변환전 a4(String) : %s -> a1(int) : %d\n", a4 = a1 + "", Integer.parseInt(a1 + ""));
	}

}
