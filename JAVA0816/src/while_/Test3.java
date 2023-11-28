package while_;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i = 0;
//				
//		while(i < 24) {
//			int j = 0;		
//			while(j < 60) {
//				int k = 0;
//				while(k < 60) {
//					System.out.printf("%d시 %d분 %d초\n", i, j, k);
//					k++;
//				}			
//				System.out.printf("\n");
//				j++;
//			}			
//			System.out.printf("\n");
//			i++;
//		}	
		
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
