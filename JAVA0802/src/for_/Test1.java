package for_;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TIMESTABLE = 9;
		
//		while(true) {			
//			int num = sc.nextInt();
//			if(num == 0) {
//				System.out.println("종료!"); break;
//			}
			
//			for(int i = 1; i <= num; i++) {
//				System.out.println(i);
//			}
			
//			for(int i = 1; i <= TIMESTABLE; i++) {
//				System.out.println(num + " * " + i + " = " + (num * i));
//			}
//		}
		
		for(int j = 2; j <= TIMESTABLE; j++) {
			System.out.println("[" + j + "단]");
			for(int i = 1; i <= TIMESTABLE; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
			System.out.println("");
		}
	}
}
