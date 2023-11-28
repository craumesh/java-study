package switch_;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Loop1:
		while(true) {
			int score = sc.nextInt();
			if(score <= 100 && score >= 0) {
				switch(score/10) {
				case 10: 
				case 9: System.out.println(score + "점의 학점 : A"); break;
				case 8: System.out.println(score + "점의 학점 : B"); break;
				case 7: System.out.println(score + "점의 학점 : C"); break;
				case 6: System.out.println(score + "점의 학점 : D"); break;
				default : System.out.println(score + "점의 학점 : F");
				}			
			}
			else {
				System.out.println("올바르지 않은 점수 입니다!\n0~100 내에서 입력해 주세요!"); break Loop1;
			}
		}
	}
}
