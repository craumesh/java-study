import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int num2 = 0;
		
		num = (int)(Math.random()*100);
		
		while(num != num2) {
			num2 = sc.nextInt();
			if(num2 < num) {
				System.out.println("Up!");
			}
			else if(num2 > num) {
				System.out.println("Down!");
			}
			else {
				System.out.println("정답!");
			}
		}		
	}
}
