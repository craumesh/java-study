package variable;

public class Ex {

	public static void main(String[] args) {
		int[][] xy = new int[10][10];
		int i=0;
		int i2=0;
		
		for( ; i<10; i++) {
			for( ; i2<10; i2++) {
				if(i==0 || i==9) {
					if(i2 == 0) {
						System.out.println("\u0001");
					}
					else if(i2 == 9) {
						System.out.println("\u0002");
					}
					else {
						System.out.println("\u0006");
					}
				}
				
				if(i2==0 || i2==9) {
					if(i == 0) {
						System.out.println("\u0003");
					}
					else if(i == 9) {
						System.out.println("\u0004");
					}
					else {
						System.out.println("\u0005");
					}					
				}
			}
		}
	}

}
