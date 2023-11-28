package while_;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 중첩 while문
		 * - 중첩 for문과 마찬가지로 while문 내부터 또 다른 while 문을 기술
		 */
		
		int i = 2;
		
		while(i < 10) {
			int j = 1;
			System.out.printf("[%d단]\n", i);			
			while(j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}			
			System.out.printf("\n");
			i++;
		}		
	}
}
