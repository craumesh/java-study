package for_;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - 특정 조건에 따라 지정된 범위의 문장들을 반복 실행하는 문
		 * - for문, while문으로 구분됨
		 * 
		 * 1. 랙문
		 * - 가장 기본적인 반복문
		 * - 반복 횟수가 정해져 있는 경우에 주로 사용
		 * - 초기식, 조건식, 증감식의 위치가 정해져 있어, 초보자가 익히기 쉬움
		 * - 초기식 : 반복 횟수를 판별하기 위한 조건에 사용됨
		 * 제어변수를 선언하거나 초기화하는 문장
		 * - 조건식 : 반복 여부를 결정하기 위한 조건식
		 * -> if문과 마찬가지로 true 일 때 블록 내의 문장을 실행하고
		 * false 일 때 랙문을 종료하고 빠져나감
		 * - 증감식 : 반복을 위한 조건식에 맞춰 초기식에서 초기화한 제어변수를
		 * 증가 또는 감소시키는 문장
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("종료!"); break;
			}
			
//			for(int i = 1; i <= num; i++){
//				System.out.println(i + " : Hello World!");
//			}
			
//			for(int i = 1; i <= num; i++){
//				System.out.println(i);
//			}
			
//			for(int i = 1; i <= num; i+=2){
//				System.out.println(i);
//			}
			
//			for(int i = 2; i <= num; i+=2){
//				System.out.println(i);
//			}
			
			for(int i = 10; i >= num; i--){
				System.out.println(i);
			}
		}		
	}
}
