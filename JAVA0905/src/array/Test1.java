package array;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(num));
		System.out.println("=================================================");
		
		boolean[] bool = new boolean[3];
		bool[1] = true;
		System.out.println(Arrays.toString(bool));
		System.out.println("=================================================");
		
		String[] str = new String[3];
		str[0] = "홍길동";
		str[1] = "이순신";
		System.out.println(Arrays.toString(str));
		System.out.println("=================================================");
		
		double[] doub = new double[4];
		doub[0] = 1.1;
		doub[1] = 1.2;
		System.out.println(Arrays.toString(doub));
		System.out.println("=================================================");
	}

}
