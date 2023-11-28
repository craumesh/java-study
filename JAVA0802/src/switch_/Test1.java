package switch_;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Loop1:
		while(true) {
			int iMonth = sc.nextInt();
			switch(iMonth) {
			case 0: System.out.println("종료!"); break Loop1;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("해당 달의 일 수는 31일 입니다!"); break;
			case 4:
			case 6:
			case 9:
			case 11: System.out.println("해당 달의 일 수는 30일 입니다!"); break;
			case 2: System.out.println("해당 달의 일 수는 28일 입니다!"); break;
			default: System.out.println("1~12 범위 내에서 입력 해주세요!");
			}
		}
	}
}
