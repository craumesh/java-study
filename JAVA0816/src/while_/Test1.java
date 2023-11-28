package while_;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = 2;
//		int j = 1;
//		
//		while(i < 10) {
//			System.out.printf("[%d단]\n", i);
//			while(j < 10) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//				j++;
//			}			
//			i++;
//			j = 1;
//		}
		
		int sum = 0;
		int i = 1;
		final int MAXNUM = 10;
		
		while(i <= MAXNUM) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 10까지의 합 : %d",sum);
	}

}
