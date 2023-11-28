package for_;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 1; i<=10; i++) {
//			for(int j = 1; j<=5; j++) {
//				System.out.println("i = " + i + ", j = " + j);
//			}
//		}
		
//		for(int i = 2; i<10; i++) {
//			System.out.println("\n[" + i + "단]");
//			for(int j = 1; j<10; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}
		
//		int dice1 = 0, dice2 = 0, cnt = 0;
//		
//		while(dice1 + dice2 != 6) {
//			cnt++;
//			dice1 = (int)(Math.random()*6+1);
//			dice2 = (int)(Math.random()*6+1);
//			System.out.println(" [" + cnt + "회]\ndice1 : " + dice1 + "\ndice2 : " + dice2 + "\n");
//		}
//		
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= 6; j++) {
//				if(i + j == 6) {
//					System.out.println("i = " + i + "\nj = " + j + "\n");
//				}
//			}
//		}
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				if((4 * i) + (5 * j) == 60) {
					System.out.printf("x = %d, y = %d\n4 * %d + 5 * %d = 60\n\n", i,j,i,j);
				}
			}
		}
		
		
	}
}
