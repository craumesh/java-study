package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainRegex = "^[A-Za-z0-9!@#$%]{8,16}$";
		String upperRegex = "[A-Z]";
		String lowerRegex = "[a-z]";
		String numRegex = "[0-9]";
		String specRegex = "[!@#$%]";
		String[] passwords = {"Abcde123!","abcde123@","abcde123","123456789","abcde한글!"};		
		for(String password : passwords) {		
			int pwpoint = 0;
			if(Pattern.matches(mainRegex, password)) {
//				if(Pattern.compile(upperRegex).matcher(password).find()) {
//					pwpoint++;
//				}
//				if(Pattern.compile(lowerRegex).matcher(password).find()) {
//					pwpoint++;
//				}
//				if(Pattern.compile(numRegex).matcher(password).find()) {
//					pwpoint++;
//				}
//				if(Pattern.compile(specRegex).matcher(password).find()) {
//					pwpoint++;
//				}
				pwpoint += Pattern.compile(upperRegex).matcher(password).find()? 1:0; 
				pwpoint += Pattern.compile(lowerRegex).matcher(password).find()? 1:0; 
				pwpoint += Pattern.compile(numRegex).matcher(password).find()? 1:0; 
				pwpoint += Pattern.compile(specRegex).matcher(password).find()? 1:0; 
				
				switch(pwpoint) {
				case 1: System.out.println(password+" : 위험!"); break;
				case 2: System.out.println(password+" : 경고!"); break;
				case 3: System.out.println(password+" : 보통!"); break;
				case 4: System.out.println(password+" : 안전!"); break;
				}
			} else {
				System.out.println("8자에서 16자 이내의 영어,숫자,특수문자를 입력해주세요");
			}
		}
		
	}

}
