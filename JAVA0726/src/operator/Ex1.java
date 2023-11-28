package operator;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 산술 연산 시 자동 형변환
		 * - int 타입보다 작은 타입간의 연산은 모두 int 타입으로 변환 후 수행, 결과값은 모두 int 형태가 됨
		 * - int 타입보다 큰 타입은 큰 타입의 형태로 변환됨
		 * - 따라서 다시 작은 타입의 변수에 저장하려할시 강제 형변환 필요
		 */
		
//		int a = 3;
//		int b = 2;
//		double c = 0;
//		
//		c = (double)a / b;
//		System.out.printf("%f",c);
		
		/* float와 double의 연산은 double로 변환뒤 진행되는데
		 * 근사치 표현에 의해 잘못 된 결과 발생 가능
		 * 소숫점 제거 시 float 타입으로 강제 변환 후 수행
		 */
		
//		float f1 = 0.1f;
//		double d1 = 0.1;
//		
//		System.out.println(f1);
//		System.out.println(d1);
//		System.out.println(f1+d1);
//		System.out.println(f1+(float)d1);
		
		/* 리터럴 간의 연산시에는 자동 형변환이 발생하지 않음
		 * 리터럴 끼리의 연산이라도 표현 가능 범위 초과 시 오류 발생
		   byte b5 = 10 + 200; // byte 범위 초과로 int 자동 변환 되어 오류 발생 */
	}

}
