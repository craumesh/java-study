package variable;

public class Ex3 {
	public static void main(String[] args) {	
		int iBoardSize = 20;
		
		while(true) {
			for(int y = 0 ; y < iBoardSize; y++) {
				for(int x = 0; x < iBoardSize; x++) {
					if(x == 0 && y == 0) {
						System.out.print("\u0001");
					}
					else if(x == iBoardSize-1 && y == 0) {
						System.out.print("\u0002");
					}
					else if(x == 0 && y == iBoardSize-1) {
						System.out.print("\u0003");
					}
					else if(x == iBoardSize-1 && y == iBoardSize-1) {
						System.out.print("\u0004");
					}
					else if(y == 0 || y == iBoardSize-1) {
						System.out.print("\u0006");
					}	
					else if(x == 0 || x == iBoardSize-1) {
						System.out.print("\u0005");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
