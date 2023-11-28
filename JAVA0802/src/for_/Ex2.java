package for_;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
/*
 * 반복문을 사용한 연산의 누적
 * 1. 연산을 누적할 누적 변수 선언 및 초기화(반복문보다 먼저 수행)
 * 2. 반복문을 사용하여 특정 횟수 반복
 * 3. 반복문 내에서 특정 연산(데이터)를 누적 변수에 누적
 * 4. 반복문 종료 후 누적 변수 값 사용(출력)
 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			int sum = 0;
			int oddSum = 0;
			int evenSum = 0;
			
			if(num == 0) break;
			
//			for(int i = 1; i <= num; i++) {
//				sum += i;
//			}
//			System.out.println("1부터 " + num + "까지의 정수의 합 : " + sum);
			
//			for(int i = 1; i <= num; i+=2) {
//				oddSum += i;
//			}
//			System.out.println("1부터 " + num + "까지의 홀수의 합 : " + sum);
//			
//			for(int i = 2; i <= num; i+=2) {
//				evenSum += i;
//			}
//			System.out.println("1부터 " + num + "까지의 짝수의 합 : " + sum);
			
			
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					evenSum += i;
				}
				else {
					oddSum += i;
				}
			}
			System.out.println("1부터 " + num + "까지의 홀수의 합 : " + oddSum + "\n" + "1부터 " + num + "까지의 짝수의 합 : " + evenSum);
		}
	}
}
