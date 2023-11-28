package if_;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// "아이티윌로 걸어서 출발"
		// money 변수 선언, 초기값 2000원
		// 윤지씨가 돈이 5천원 이상 있다면 "택시타고 가기!" 출력
		// 만약 5000원 미만 이라면 "버스타고 가기!" 출력
		// "아이티윌 도착!" 출력
		
//		int money = 2000;
//		int wow = 50;
//		
//		money += (int)(Math.random() * 10000);
//		
//		if(money > 5000) {
//			System.out.println("택시타고 가기!");			
//		}else {
//			System.out.println("버스타고 가기!");
//			if(wow > (int)(Math.random()*100)) {
//				System.out.println("잘못 내려서 걸어가기!");
//			}
//		}
//		System.out.println("아이티윌 도착!");
//		
//		
//		Scanner sc = new Scanner(System.in);
//		int age = 0;
//		boolean mode = true;
//		
//		while(mode) {
//			age = sc.nextInt();
//			if(age == 0) {
//				mode = false;
//				break;
//			}
//			
//			if(age >= 20 && age < 30) {
//				System.out.println("당신은 20대 입니다!");
//			}
//			else {
//				System.out.println("당신은 20대가 아닙니다!");
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		int age = 0;
		boolean mode = true;
		
		while(mode) {
			age = sc.nextInt();
			if(age == -1) {
				mode = false;
				break;
			}
			
			if(age < 5 || age > 65) {
				System.out.println("무료 입장!");
			}
		}
		
	}

}
