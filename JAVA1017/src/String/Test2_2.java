package String;

import java.util.Arrays;

public class Test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "admin123";
		System.out.println(CharEncrypt.encrypt(str));
	}

}

class CharEncrypt {	
	public static String encrypt(String str) {
		char[] chArr = str.toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = Character.valueOf((char)(chArr[i] + 3));
		}		
//		return Arrays.toString(chArr);
		
//		String rStr = new String(chArr);
		
//		String rStr = String.valueOf(chArr);
//		return rStr;
		
		StringBuilder buffer = new StringBuilder();
		for(char ch:chArr) {
			buffer.append(ch);
		}
		return buffer.toString();
	}
}