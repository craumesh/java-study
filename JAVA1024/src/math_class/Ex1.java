package math_class;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * java.lang.Math 클래스
		 * - 수학적인 다양한 기능을 상수와 메서드로 제공
		 * - 모든 상수와 메서드는 클래스명 만으로 접근 가능
		 * 	ex) Math.PI, Math.random()
		 */
		
		System.out.println("파이 값 : " + Math.PI);
		System.out.println("------------------------------------------------------");
		
		int num = -10;
		
		System.out.println("num의 절대값 : " + Math.abs(num));
		System.out.println("num과 20중 큰 값 : " + Math.max(num, 20));
		System.out.println("num과 20중 작은 값 : " + Math.min(num, 20));
		System.out.println("4의 제곱근 : " + (int)Math.sqrt(4));
		
		System.out.println("------------------------------------------------------");
		
		double dNum = 3.141592;
		System.out.println(Math.ceil(dNum)); // 소수점 첫째자리 올림
		System.out.println(Math.floor(dNum)); // 소수점 첫째자리 버림
		System.out.println(Math.round(dNum)); // 소수점 첫째자리 반올림(정수 리턴)
		
		/*
		 * round() 메서드는 항상 소수점 첫째자리에서 반올림이 수행되는데
		 * X번째 자리 반올림을 수행하기 위해서는 반올림할 숫자를
		 * 소숫점 첫째자리에 위치하도록 변경해야함
		 * ex) 3.141592 의 소수점 4번째 숫자(5)를 반올림 위치로 가져올려면
		 * 	(해당 숫자를 소수점 첫째자리에 위치하기 위해)
		 * 	3.141592 * 1000 원래 숫자에 10*3을 곱하거나 공식에 따른 계산 작업을 수행해야함
		 * 	(해당 숫자에 10^(x-1) 값을 곱함(x는 반올림할 자리의 위치)
		 * 	=> 3.141592 * (10^(4-1)
		 * 	x승을 표시하여 계산하려면 Math.pow(10,x)
		 */
		
		System.out.println(dNum * 1000);
		System.out.println(dNum * Math.pow(10, 4-1));
		
		System.out.println(Math.round(dNum * 1000));
		System.out.println(Math.round(dNum * Math.pow(10, 4-1)));
		
		System.out.println(Math.round(dNum * 1000)/1000.0);
		System.out.println((double)(Math.round(dNum * 1000))/1000);
		// => long 타입 결과값을 int 타입 1000 으로 나누면 결과값이 long 이므로
		//		반드시 둘 중 하나라도 double 타입 실수로 연산 수행하거나 명시적 형변환 필요
		System.out.println(Math.round(dNum * Math.pow(10, 4-1))/Math.pow(10, 4-1));
		
		// =================================================================================
		// 특정 위치의 숫자까지만 남기고 나머지는 제거해야 할 경우
		// ex) 3.141592 의 소수점 넷째자리만 남길 경우 3.1415
		//	1) 원하는 자리의 숫자까지 정수자리에 위치하도록 곱함
		//		3.141592 -> 31415.92
		System.out.println(dNum * 10000);
		//	2) 소수 부분의 숫자를 제거하기 위해 정수화 진행
		//		31415.92 -> 31415
		System.out.println((int)(dNum * 1000));
		//	3) 다시 원래 숫자로 복원하기 위해 처음에 곱한 값으로 다시 나눔
		//		=> 소수점 표현을 위해 double 타입 실수로 나누거나 명시적 형변환
		System.out.println((int)(dNum * 10000) / 10000.0);
		System.out.println((double)((int)(dNum * 10000)) / 10000);
		
		
	}

}
