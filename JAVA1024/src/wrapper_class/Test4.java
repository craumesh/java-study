package wrapper_class;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chArr = {'A','b','5',' ','#'};
		Distinct.chDistict(chArr);
	}

}

class Distinct {
	
	public static void chDistict(char[] chArr) {
		for(int i = 0; i < chArr.length; i++) {
			if(Character.isUpperCase(chArr[i])) {
				System.out.println("chArr[" + i + "] : " + chArr[i] + " - 대문자!");
			} else if(Character.isLowerCase(chArr[i])) {
				System.out.println("chArr[" + i + "] : " + chArr[i] + " - 소문자!");
			} else if(Character.isDigit(chArr[i])) {
				System.out.println("chArr[" + i + "] : " + chArr[i] + " - 숫자!");
			} else if(Character.isWhitespace(chArr[i])) {
				System.out.println("chArr[" + i + "] : " + chArr[i] + " - 공백문자!");
			} else {
				System.out.println("chArr[" + i + "] : " + chArr[i] + " - 기타문자!");
			}
			
		}
	}
}