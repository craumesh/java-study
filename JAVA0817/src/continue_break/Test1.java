package continue_break;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		final int MAXNUM = 100;
//		final int MAXSUM = 1000;
//		int num = 1;
//		int sum = 0;
//		
//		while(sum < MAXSUM) {
//			if(num < MAXNUM) {
//				sum += num;
//				num++;
//			}
//		}
//		System.out.printf("1부터 자신까지의 합이 1000을 넘는 시점의 정수 : %d, %d\n", num - 1, sum);
//		
//		num = 1;
//		sum = 0;
//		
//		while (true) {
//			if(sum > MAXSUM) {
//				break;
//			}
//			
//			if(num < MAXNUM) {
//				sum += num;
//				num++;
//				continue;
//			}
//			System.out.println("ㅁㄴㅇㄹ");
//		}		
//		System.out.printf("1부터 자신까지의 합이 1000을 넘는 시점의 정수 : %d, %d\n", num - 1, sum);
		
		final int MAXSUM = sc.nextInt();
		int num = 1;
		int sum = 0;
		
		while(true) {
			if(sum >= MAXSUM) {
				break;
			}
			if(num % 2 != 0) {
				sum += num;				
			}else {
				sum += -num;
			}	
			num++;
		}		
		System.out.printf("총합이 %d 이상 일때의 정수 / 합 : %d / %d\n", MAXSUM, num - 1, sum);
	}
}
