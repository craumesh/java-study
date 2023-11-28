package if_;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean mode = true;
		char alp;
		
		while(mode) {
			alp = sc.next().charAt(0);
			if(alp == '0') {
				System.out.println("종료!");
				mode = false;
				break;
			}
			
			if(alp >= 'A' && alp <= 'Z') {
				System.out.println("대문자!");
			} else if(alp >= 'a' && alp <= 'z') {
				System.out.println("소문자!");
				System.out.println(alp);
				alp -= 32;
				System.out.println("대문자 변환 -> " + alp);
			}
		}
	}
}
