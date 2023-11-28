
public class Ex3 {

	public static void main(String[] args) {
		int[][] xy = new int[10][10];
		for(int i = 0; i<10; i++) {
			for(int i2 = 0; i2<10; i++) {
				if(i==0 || i==9) {
					xy[i][i2] = 0;
				}
				else if(i2==0 || i2==9) {
					xy[i][i2] = 0;
				}
			}
		}
	}

}
