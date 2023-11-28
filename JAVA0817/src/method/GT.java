package method;

import java.util.Scanner;
import lib.Character_Lib;

class Play{
	Scanner sc = new Scanner(System.in);
	int pc_Num = 0;
	
	public void intoIntro() {
		System.out.printf("1. 게임 시작\n2. 게임 종료\n");
		int indexSelector = sc.nextInt();
		switch(indexSelector) {
		case 1: selectPC(); break;
		case 2: break;
		default: intoIntro();
		}
	}
	
	public void selectPC() {
		pc_Num = sc.nextInt();
	}
	
}

public class GT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Play gtGame = new Play();
	}

}
