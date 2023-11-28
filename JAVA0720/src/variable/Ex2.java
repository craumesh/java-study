package variable;

public class Ex2 {

	public static void main(String[] args) {
		int[][] array = new int[10][10];
		int x=0;
		int y=0;
		
		for( ; y<10; y++) {
			for( ; x<10; x++) {
				if(x == 0 && y == 0) {
					System.out.println("\u0001");
				}
				else if(x == 9 && y == 0) {
					System.out.println("\u0002");
				}
				else if(x == 0 && y == 9) {
					System.out.println("\u0003");
				}
				else if(x == 9 && y == 9) {
					System.out.println("\u0004");
				}
				else if(y == 0) {
					System.out.println("\u0005");
				}	
				else if(x == 0) {
					System.out.println("\u0006");
				}
			}
		}
	}

}
