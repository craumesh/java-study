package scanner;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		if(!(name.equals(""))) {
			System.out.println(name + " 님 환영합니다!");
		} else {
			System.out.println("이름을 입력해주세요!");			
		}
	}

}
