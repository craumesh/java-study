package array;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열의 최대값을 구하는 코드
		 * numbers = { 3, 2, 14, 21, 100 ,4, 2, 1 }
		 */
		
		int[] numbers = { 3, 2, 14, 21, 100 ,4, 2, 1 };
		int max = 0, min = 0, sum = 0, avg = 0;
		Arrays.sort(numbers);
		
		max = numbers[numbers.length-1];
		min = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		avg = sum / numbers.length;
		
		System.out.printf("최대값 : %d\n최소값 : %d\n합계 : %d\n평균값 : %d\n", max, min, sum, avg);
	}

}
