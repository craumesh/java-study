package dataType;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
	
		while(true) {
			System.out.print("10진수 : ");
			num = sc.nextInt();
			if(num == 0) {
				break;
			}
			//2진수 앞에는 접두 0b - ex)num = 0b1010;
			System.out.print("2진수 : " + Integer.toBinaryString(num) + "\n");
			//8진수 앞에는 접두 0 - ex)num = 017;
			System.out.print("8진수 : " + Integer.toOctalString(num) + "\n");
			//16진수 앞에는 접두 0x - ex)num = 0x2a;
			System.out.print("16진수 : " + Integer.toHexString(num) + "\n\n");
		}
	}
}
